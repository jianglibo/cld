#!/bin/sh
# boot-run.tcl \
exec tclsh "$0" ${1+"$@"}

# runningDir, command, jarFile, profile, pidFile

foreach arg $argv {
  puts $arg
}


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

set cmd [lindex $argv 0]

switch $cmd {
	start {[start [lrange $argv 1 end]]}
	stop {[stop [lindex $argv 3]]}
	restart {[restart [lrange $argv 1 end]]}
	default {puts stdout "do nothing!"}
}
