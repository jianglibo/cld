#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package require Expect

set ::baseDir [file dirname [info script]]
lappend auto_path [file join $::baseDir share]

set ::baseDirAbs [file normalize $::baseDir]

cd $::baseDir

set ::rawParamDict [dict create]

foreach a $::argv {
  set pair [split $a =]
  if {[llength $pair] == 2} {
    dict set ::rawParamDict [string trimleft [lindex $pair 0] -] [lindex $pair 1]
  } elseif {[llength $pair] == 1} {
    set actionName  [lindex $pair 0]
  }
}

catch {exec dos2unix flyway} msg o

puts [exec ./flyway $actionName]

set dbfile {}
if {[catch {open [file join $::baseDirAbs conf flyway.conf]} fid o]} {
  puts $fid
  exit 1
} else {
  while {[gets $fid line] >=0} {
    if {[string first flyway.url= $line] == 0} {
      if {[string match *jdbc:h2:file* $line]} {
        set dbfile [lindex [split $line :] end]
        break
      }
    }
  }
  close $fid
}

set hasDbFile [expr {[string length $dbfile] > 0}]
set hasUserParam [dict exists $::rawParamDict user]

set dbfile [join [lreplace [split $dbfile /] end end] /]

if {$hasDbFile && $hasUserParam} {
  set user [dict get $::rawParamDict user]
  puts [exec chown $user:$user [file join $dbfile]]
  puts "chowned $dbfile"
}
