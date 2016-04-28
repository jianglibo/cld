#!/bin/sh
# boot-run-systemd.tcl \
exec tclsh "$0" ${1+"$@"}

set runFolder @runFolder@
set jarFile @jarFile@
set profile @profile@ 

cd $runFolder
exec java -jar -Dspring.profiles.active=$profile $jarFile >> nohup.out
