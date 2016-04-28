#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

# copy xx.jar and all tcl file to server.
# run-on-server.tcl

set ::baseDir [file dirname [info script]]
package require Expect

set ::serverSideDir ~/spring-boot-install

proc prepareRunFolder {host} {
  puts "start prepare run folder on server $host...."
  puts [exec ssh root@$host "mkdir -p $::serverSideDir"]
  puts [exec scp -r [file join $::baseDir scripts $an]  root@$host:$::serverSideDir]
  set tmp [glob -types f -directory $::baseDir -- *.*]

  foreach f $tmp {
    exec scp $f root@${host}:$::serverSideDir
  }
}



catch {[exec systemctl list-unit-files | grep redis]} units

if {[lsearch units redis.service] != -1} {
	puts stdout "redis already installed.!"
	exit 0
}

set redisFolder /opt/redis
set redisFile redis-3.0.7.tar.gz
set fileUrl http://www.fh.gov.cn/$redisFile

set unitFile /etc/systemd/system/redis.service

catch {[exec cc --version]} msg

puts stdout $msg

if {[string match "*command not found*" $msg] || [string match "*no such file or directory*" $msg]} {
	puts stdout "gcc not installed, start to install."
	exec yum install -y gcc
	puts stdout "gcc install successly."
}

if {! [file exists $redisFolder]} {
	exec mkdir -p $redisFolder
}

cd $redisFolder

if {! [file exists $redisFolder/$redisFile]} {
  puts stdout "start downloading $fileUrl ....\n"
	exec curl -O $fileUrl >&  curloutput.log
	puts stdout "download finished.\n"
}

if {! [file exists $redisFolder/$redisFile]} {
	puts stdout "download $fileUrl failed."
	exit 2
}

if {[file size $redisFolder/$redisFile] < 10000} {
	puts stdout "download $fileUrl failed.deleting partial file..."
	file delete $redisFolder/$redisFile
	exit 2
}

set extractFolder [join [lrange [split $redisFile .] 0 end-2] .]

# not installed yet.
if {[file exists $extractFolder/src/redis-server]} {
	cd $extractFolder
} else {
	cd $redisFolder

	exec tar -zxf $redisFile

	cd $extractFolder
	set code [catch {[exec make]} msg]

	if {! [string match "*It's a good idea to run 'make test'*" $msg]} {
		exec make distclean
		set code [catch {[exec make]} msg]
	}

	if {! [string match "*It's a good idea to run 'make test'*" $msg]} {
		puts stdout "make failed!"
		exit 1
	}
}

if {[file exists $unitFile]} {
	puts stdout "redis unit file already exists. skip creating..."
} else {
	# create unit file
	set unitFd [open $unitFile w]
	set content {
		[Unit]
		Description= Redis server
		After=network.target

		[Service]
		ExecStart=%s/src/redis-server %s/redis.conf
		Type=simple
		PIDFile=/var/run/redis.pid

		[Install]
		WantedBy=multi-user.target
	}
	foreach line [split [format $content $redisFolder/$extractFolder $redisFolder/$extractFolder] \n] {
		puts $line........
		puts $unitFd [string trim $line]
	}
	close $unitFd
	#code line in catch may output content to stderr, that make tcl script looks like wrong, but actually not.
	catch {
		exec systemctl daemon-reload
		exec systemctl enable redis.service
	} msg

	puts stdout $msg

}

puts stdout "redis installed successly. starting reids..."
exec systemctl start redis.service
