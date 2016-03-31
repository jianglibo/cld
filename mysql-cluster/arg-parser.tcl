#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package provide ArgParser 1.0
package require cmdline

namespace eval ::ArgParser {
  variable options {
      {mgmhosts.arg "" "comma seperated host(ip) names"}
      {mgmdatadir.arg "/opt/mysql-cluster" "mgm DataDir"}
      {debug  "Turn on debugging, default=off"}
  }

  variable usage ":config-mysql-cluster.tcl \[options] filename ...\noptions:"
}

proc ::ArgParser::parse {argv} {
  upvar $argv argvl
  variable options
  variable usage

  if {[catch {array set ::params [cmdline::getoptions argvl $options $usage]} msg o]} {
  	 if {"CMDLINE USAGE" eq [dict get $o -errorcode]} {
  		 puts $msg
  	 } else {
  		 puts $msg
  	 }
  	 exit 1
  #-errorcode -code -level -errorinfo -errorline
  #	 puts "-errorcode:[dict get $o -errorcode]"
  #	 puts [dict get $o -code]
  #	 puts [dict get $o -level]
  #	 puts [dict get $o -errorinfo]
  #	 puts [dict get $o -errorline]
  }
}
