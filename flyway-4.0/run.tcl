#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package require Expect

set ::baseDir [file dirname [info script]]
lappend auto_path [file join $::baseDir share]

set ::baseDirAbs [file normalize $::baseDir]

set confFile [file join $::baseDir conf flyway.conf]
set sqlFolder [file join $::baseDir sql]

file delete -force $sqlFolder
exec mkdir -p $sqlFolder
file delete -force $confFile

# pfolder=xxx, profile=xxx
set ::rawParamDict [dict create]

foreach a $::argv {
  set pair [split $a =]
  if {[llength $pair] == 2} {
    dict set ::rawParamDict [string trimleft [lindex $pair 0] -] [lindex $pair 1]
  } elseif {[llength $pair] == 1} {
    set actionName  [lindex $pair 0]
  }
}

if {! [info exists actionName]} {
  puts "Usage:"
  puts "tclsh run.tcl --pfolder=xxx --profile=xxx -host=xxxx(when remote exec) --user=xxxx(optional) migrate"
  exit 0
}

if {! ([dict exists $::rawParamDict pfolder] && [dict exists $::rawParamDict profile])} {
  puts "parameter: pfolder and profile are mandantory."
  exit 0
}

set pfolder [dict get $::rawParamDict pfolder]
set profile [dict get $::rawParamDict profile]
set pConfFile [file join $pfolder flyway conf "flyway-${profile}.conf"]
set pSqlFolder [file join $pfolder flyway sql]


if {[file pathtype $pfolder] ne {absolute}} {
  set pfolder [file join $::baseDir .. $pfolder]
}
puts $pConfFile
puts $pSqlFolder
if {! ([file exists $pConfFile] && [file exists $pSqlFolder])} {
  puts "there must exist an flyway folder in project folder."
  exit 0
}

file copy -force  $pConfFile $confFile

file copy -force {*}[glob -directory $pSqlFolder *] $sqlFolder

set hostExists [dict exists $::rawParamDict host]

cd $::baseDir

set paramStr [list]

dict for {k v} $::rawParamDict {
  lappend paramStr "--${k}=$v"
}

set paramStr [join $paramStr { }]

if {$hostExists} {
  set host [dict get $::rawParamDict host]
  puts $::baseDir
  exec scp -r $::baseDirAbs  "root@${host}:."

#  spawn ssh root@$host "cd ~/[file tail $::baseDir];dos2unix flyway;./flyway $actionName"
 spawn ssh root@$host "cd ~/[file tail $::baseDir];tclsh run-on-server.tcl $paramStr $actionName"
  expect {
    eof {}
  }
} else {
  puts [exec cmd /c flyway $actionName]
}

#clean up.
file delete -force $sqlFolder
