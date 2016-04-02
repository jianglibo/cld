package provide MysqlClusterInstaller 1.0

namespace eval ::MysqlClusterInstaller {
	variable mysqlFolder /opt/mysql-cluster
	variable rs MySQL-Cluster-gpl-7.4.10-1.el7.x86_64.rpm-bundle.tar
	variable host http://www.fh.gov.cn
}

#http://dev.mysql.com/get/Downloads/MySQL-Cluster-7.4

proc ::MysqlClusterInstaller::install {} {
	variable mysqlFolder

	if {! [file exists $mysqlFolder]} {
		exec mkdir -p $mysqlFolder
	}

	cd $mysqlFolder

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



#catch {[exec ndb_setup.py --server_name=$sip]} msg
#puts stdout [exec env]
#set ndb [exec which ndb_setup.py]
#exec env PYTHONPATH=/usr/bin/python
#catch {[exec $ndb -N $sip]} msg
#puts stdout "please ssh in to $sip, and run $ndb -N $sip"
#puts stdout $msg
