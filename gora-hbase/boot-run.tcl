#!/bin/sh
# boot-run.tcl \
exec tclsh "$0" ${1+"$@"}

# runningDir, command, jarFile, profile, pidFile
# example /opt/ttmp/eureka-server/boot-run.tcl /opt/eureka-server restart eureka-server-0.0.1-SNAPSHOT.jar dev boot.pid

if {$argc != 5} {
  puts stdout "wrong para number!"
  exit 1;
}

lassign $argv runningDir command jarFile profile pidFile

if {! [file exists $runningDir]} {
  exec mkdir -p $runningDir
}

# determine script location.
set scriptDir [file dirname [info script]]
puts stdout "script file location: $scriptDir"

foreach f [glob -directory $scriptDir -- *] {
  switch -glob $f {
    *.tcl {}
    *.sh {}
    default {file copy -force -- $f $runningDir}
  }
}

cd $runningDir

proc start {} {
  puts stdout "starting"
  puts "exec nohup java -jar -Dspring.profiles.active=$::profile $::jarFile > nohup.out &"
  set processId [exec nohup java -jar -Dspring.profiles.active=$::profile $::jarFile >> nohup.out &]
 	set pidFileFd [open $::pidFile w]
 	puts -nonewline $pidFileFd $processId
 	close $pidFileFd
}

proc stop {} {
  puts stdout "stoping"
  if {[file exists $::pidFile]} {
    set fd [open $::pidFile]
    set pidNumber [read -nonewline $fd]
    close $fd
    if {[string length [string trim $pidNumber]]} {
      catch {exec kill -s 9 $pidNumber} msg
    }
  } else {
    puts stdout "pid file not found!"
  }
}

proc restart {} {
  stop
  start
}

# 1 command
# 2 jarFile
# 3 profile
# 4 pidFile

switch $command {
	start {
    start
  }
	stop {
    stop
  }
	restart {
    restart
  }
	default {
    puts stdout "do nothing!"
  }
}
