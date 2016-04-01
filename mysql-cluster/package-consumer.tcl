#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package require yaml

set scriptDir [file dirname [info script]]
lappend auto_path $scriptDir

if {$argc != 1} {
  puts stderr "please add config file parameter."
  exit 1
}

set cfgFile [file join $scriptDir [lindex $argv 0]]
catch {[set configDict [::yaml::yaml2dict -file $cfgFile]]} msg o

if {! ([dict get $o -errorcode] eq {NONE})} {
  puts stderr $msg
  exit 1
}

package require myroles

::myroles::runRoleActions $configDict
