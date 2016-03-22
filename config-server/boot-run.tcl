#!/bin/sh
# boot-run.tcl \
exec tclsh "$0" ${1+"$@"}

# runningDir, command, jarFile, profile, pidFile

if {$argc != 5} {
  puts stdout "wrong para number!"
  exit 1;
}

lassign $argv runningDir command jarFile profile pidFile

proc start {jarFile profile {pidFile boot.pid}} {
  puts stdout "starting"
  set processId [pid [open | nohup java -jar -Dspring.profiles.active=$profile $jarFile > nohub.out &]]

 	set pidFile [open $pidFile w]
 	puts $pidFile -nonewline $processId
 	close $pidFile
}

proc stop {{pidFile boot.pid}} {
  puts stdout "stoping"
	exec cat $pidFile | xargs kill -s 9
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
