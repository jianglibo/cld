#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

set mysqlFolder /opt/mysql-cluster
set rs MySQL-Cluster-gpl-7.4.10-1.el7.x86_64.rpm-bundle.tar
set sip 192.168.33.53

if "! [file exists $mysqlFolder]" {
	exec mkdir -p $mysqlFolder
}

cd $mysqlFolder

if "! [file exists $rs]" {
	exec curl -OL http://dev.mysql.com/get/Downloads/MySQL-Cluster-7.4/$rs >& curloptout.log
	exec tar -xvf $rs
}

foreach f [glob MySQL*.rpm] {
	puts stdout $f
	catch {[exec yum localinstall -y $f]} msg
}

catch {[exec yum install -y python-paramiko]} msg

#catch {[exec ndb_setup.py --server_name=$sip]} msg
puts stdout [exec env]
set ndb [exec which ndb_setup.py]

catch {[exec $ndb --server_name=$sip]} msg
puts stdout "please ssh in to $sip, and run $ndb --server_name=$sip"
puts stdout $msg
