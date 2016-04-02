#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package provide ArgParser 1.0
package require cmdline

namespace eval ::ArgParser {
  variable options {
      {manageNodeIps.arg "" "ipaddr and nodeId, example: 192.168.33.50/50,192.168.33.51/51"}
      {dataNodeIps.arg "" "ipaddr and nodeId, example: 192.168.33.50/1,192.168.33.51/2"}
      {mysqlNodeIps.arg "" "ipaddr and nodeIds, example: 192.168.33.50/101-102-103,192.168.33.51/104-105-106"}
      {manageNodeDataDir.arg "/opt/mysql-cluster" "mgm DataDir"}
      {debug  "Turn on debugging, default=off"}
  }

  variable usage ":config-mysql-cluster.tcl \[options] filename ...\noptions:"
}

proc ::ArgParser::parse {argv} {
  upvar $argv argvl
  variable options
  variable usage

  if {[catch {array set params [cmdline::getoptions argvl $options $usage]} msg o]} {
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

  set manageNodeIps [split $params(manageNodeIps) ,]
  set dataNodeIps [split $params(dataNodeIps) ,]
  set mysqlNodeIps [split $params(mysqlNodeIps) ,]
  set manageNodeDataDir $params(manageNodeDataDir)

  set allIps [list]
  set mysqlNodeIpDicts [list]

  foreach ip1 $mysqlNodeIps ip2 $manageNodeIps ip3 $mysqlNodeIps {
    set l [split $mip -]
    if {[llength $l] != 2} {
      puts stderr "wrong mysqlNodeIp format.$l"
      exit 1
    }
    lappend mysqlNodeIpDicts [dict create ip [lindex $l 0] instance [lindex $l 1]]
    lappend allIps [lindex $l 0]
  }

  foreach ip1 $manageNodeIps ip2 $dataNodeIps {
    if {[string length $ip1] > 0} {
      lappend allIps $ip1
    }
    if {[string length $ip2] > 0} {
      lappend allIps $ip2
    }
  }

  set paramsDict [dict create]

  dict set paramsDict manageNodeIps [lsort -unique $manageNodeIps]
  dict set paramsDict dataNodeIps [lsort -unique $dataNodeIps]
  dict set paramsDict mysqlNodeIps [lsort -unique $mysqlNodeIpDicts]
  dict set paramsDict manageNodeDataDir $manageNodeDataDir
  dict set paramsDict allIps [lsort -unique $allIps]

  return $paramsDict
}
