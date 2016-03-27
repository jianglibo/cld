#!/bin/sh
# boot-run.tcl \
exec tclsh "$0" ${1+"$@"}

set runningDir @runningDir@
set jarFile @jarFile@
set profile @profile@ 

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
exec java -jar -Dspring.profiles.active=$profile $jarFile >> nohup.out 
