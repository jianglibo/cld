#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package provide myroles 1.0

package require confutil
package require ManageRole

namespace eval ::myroles {

}

proc ::myroles::runRoleActions {configDict} {
  set myip [getMyIp $configDict]
  set nodeCfg [::confutil::getNodeConfig $configDict manageNodes $myip]
  if {[string length $nodeCfg] > 0} {
    ::ManageRole::run $configDict $nodeCfg
  }

#  if {[lsearch -exact [dict get $configDict dataNodeIps] $myip] != -1} {
#      #run dataNodeRoleAction
#  }

#  foreach mdic [dict get $configDict mysqlNodeIps] {
#    if {[dict get $mdic ip] eq $myip} {
      #run mysqlNodeRoleAction
#      break;
#    }
#  }
}

proc ::myroles::getMyIp {configDict} {
  if {$::tcl_platform(platform) eq {windows}} {
    set machineIps {192.168.33.50 10.0.2.15 127.0.0.1}
  } else {
    set machineIps [list]
    set ipaddr [exec ip addr]
    foreach line [split $ipaddr \n] {
      set mt {}
      set ip {}
      regexp {inet\s+(\d+\.\d+\.\d+\.\d+)} $line mt ip
      if {[string length $ip] > 0} {
        lappend machineIps $ip
      }
    }
  }
  foreach ip $machineIps {
    if {[::confutil::ipExists $configDict $ip]} {
      return $ip
    }
  }
  return {}
}
