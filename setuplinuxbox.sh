#!/bin/bash

yum install -y tcl curl

if [ ! -f /opt/java ]
then
	mkdir -p /opt/java
fi

cd /opt/java

jdkfile='jdk-8u73-linux-x64.tar.gz'

if [ ! -f "/opt/java/$jdkfile" ]
then
	curl -O "http://www.fh.gov.cn/$jdkfile"
fi

tar -zxf "$jdkfile"