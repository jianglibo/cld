#!/bin/sh
# install-java.tcl \
exec tclsh "$0" ${1+"$@"}

set ::baseDir [file dirname [info script]]
lappend auto_path $::baseDir

set rawParamDict [dict create]

foreach a $::argv {
  set pair [split $a =]
  if {[llength $pair] == 2} {
    dict set rawParamDict [string trimleft [lindex $pair 0] -] [lindex $pair 1]
  }
}

if {[dict exists $rawParamDict runFolder] } {
  source [file join $::baseDir [dict get $rawParamDict runFolder] launcher.tcl]
} else {
  puts stderr "paramter -runFolder does not exists!"
  exit 1
}
