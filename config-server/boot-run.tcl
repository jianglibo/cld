#!/bin/sh
# boot-run.tcl \
exec tclsh "$0" ${1+"$@"}

# runningDir, command, jarFile, profile, pidFile

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

proc start {jarFile profile {pidFile boot.pid}} {
  puts stdout "starting"
  puts "exec nohup java -jar -Dspring.profiles.active=$profile $jarFile > nohub.out &"
  set processId [exec nohup java -jar -Dspring.profiles.active=$profile $jarFile > nohub.out &]
 	set pidFileFd [open $pidFile w]
 	puts $pidFileFd -nonewline $processId
 	close $pidFileFd
}

proc stop {{pidFile boot.pid}} {
  puts stdout "stoping"
  if {[file exists $pidFile]} {
    set fd [open $pidFile]
    set pidNumber [read -nonewline $fd]
    close $fd
    exec kill -s 9 $pidNumber
  } else {
    puts stdout "pid file not found!"
  }
}

proc restart {jarFile profile {pidFile boot.pid}} {
  stop $pidFile
  start $jarFile $profile $pidFile
}

# 1 command
# 2 jarFile
# 3 profile
# 4 pidFile

switch $command {
	start {[start $jarFile $profile $pidFile]}
	stop {[stop $pidFile]}
	restart {[restart $jarFile $profile $pidFile]}
	default {puts stdout "do nothing!"}
}
