package provide MysqlClusterInstaller 1.0

package require AppDetecter

namespace eval ::MysqlClusterInstaller {
	variable rs MySQL-Cluster-gpl-7.4.10-1.el7.x86_64.rpm-bundle.tar
	variable host http://www.fh.gov.cn
}

#http://dev.mysql.com/get/Downloads/MySQL-Cluster-7.4

proc ::MysqlClusterInstaller::install {tmpFolder} {

	if {[::AppDetecter::isInstalled ndb_mgmd]} {
	  puts stderr "******mysql cluster already installed.******"
		exit 0
	}

	if {! [file exists $tmpFolder]} {
		exec mkdir -p $tmpFolder
	}

	cd $tmpFolder

	variable rs
	variable host

	if {! [file exists $rs]} {
		exec curl -OL $host/$rs >& curloptout.log
		exec tar -xvf $rs
	}

	catch {[exec yum install -y python-paramiko]} msg
	puts stdout $msg

	foreach f [glob MySQL*.rpm] {
		catch {[exec yum -y remove mysql-libs]} msg
		if {[string match *-server-gpl-* $f] || [string match *-client-gpl-* $f]} {
			puts stdout "start install $f..."
			catch {[exec yum localinstall -y $f]} msg
			puts stdout $msg
			} else {
				puts stdout "skipping $f"
			}
		}
}
