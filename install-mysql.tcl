#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

set mysqlFolder /opt/mysql
set mysqlLog /var/log/mysqld.log
set rs mysql57-community-release-el7-7.noarch.rpm

if "! [file exists $mysqlFolder]" {
	exec mkdir -p /opt/mysql
	cd $mysqlFolder
	exec curl -OL http://dev.mysql.com/get/$rs

	exec yum localinstall -y $rs
	exec yum install -y mysql-community-server

	exec systemctl start mysqld
}

#set tp [exec grep "temporary password" /var/log/mysqld.log]
set mysqlLogFd [open $mysqlLog]

set tmppsd 0
while {[gets $mysqlLogFd line] >= 0} {
	if {[string match "*temporary password*:*" $line]} {
		set tmppsd [string trim [lindex [split [string trim $line] :] end]]
		break
	}
}
close $mysqlLogFd

puts stdout "temporary password is $tmppsd"

set newPass newPass%123

set initSql {
	ALTER USER 'root'@'localhost' IDENTIFIED BY '%s';
	CREATE USER 'root'@'192.168.33.1' IDENTIFIED BY '%s';
	GRANT ALL PRIVILEGES on *.* TO 'root'@'192.168.33.1';
}

set initSql [format $initSql $newPass $newPass]
#puts stdout "executing: exec mysql -uroot -p'$tmppsd' << $initSql"
catch {
	exec mysql -uroot -p'$tmppsd' --port 3306 << $initSql
} msg

if {[string match "*Access denied*" $msg]} {
	puts stdout "Access denied.Please login to box, and run: $initSql"
}
