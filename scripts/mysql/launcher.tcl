package require AppDetecter
package require CommonUtil

set mysqlFolder /opt/mysql
set mysqlLog /var/log/mysqld.log
set rs mysql57-community-release-el7-7.noarch.rpm

set action [dict get $::rawParamDict action]

if {$action eq {install}} {
	if {[::AppDetecter::isInstalled {mysqld}]} {
		puts stdout "mysql already isInstalled, skip install."
		exit 0
	}
	exec mkdir -p /opt/mysql
	cd $mysqlFolder
	puts stdout "start download $rs"
	exec curl -OL http://dev.mysql.com/get/$rs >& /dev/null
	puts stdout "download done."

	::CommonUtil::killYum


	exec yum localinstall -y $rs
	exec yum install -y mysql-community-server

	exec systemctl start mysqld
}

#set tp [exec grep "temporary password" /var/log/mysqld.log]

if {[catch {open $mysqlLog} fid o]} {
} else {
	while {[gets $fid line] >= 0} {
		if {[string match "*temporary password*:*" $line]} {
			set tmppsd [string trim [lindex [split [string trim $line] :] end]]
			break
		}
	}
	close $fid
}

puts stdout "temporary password is $tmppsd"

set newPass newPass%123

#	CREATE USER 'root'@'192.168.33.1' IDENTIFIED BY '%s';
#	GRANT ALL PRIVILEGES on *.* TO 'root'@'192.168.33.1';

set initSqlTpl {ALTER USER 'root'@'localhost' IDENTIFIED BY '%s';
create user 'firstuser'@'192.168.33.1' identified by '%s';
create database firstdb charset utf8;
grant all privileges on firstdb.* to 'firstuser'@'192.168.33.1'
flush privileges;}

set initSqlFile [file join $::baseDir mysql tmp.sql]

if {[catch {open $initSqlFile w} fid o]} {
	puts stdout "create tmp.sql failed."
} else {
	set initSql [format $initSqlTpl $newPass $newPass]
	#puts stdout "executing: exec mysql -uroot -p'$tmppsd' << $initSql"
	puts $fid $initSql
	close $fid
	set exeCmd "mysql -uroot --connect-expired-password -p'$tmppsd' --port 3306 < $initSqlFile"
	puts stdout "start execute: $exeCmd"
	catch { exec {*}$exeCmd } msg

	if {[string match "*Access denied*" $msg]} {
		puts stdout "Access denied.Please login to box, and run: $initSql"
	}
}
