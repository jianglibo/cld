#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package provide myroles 1.0

package require confutil
package require ManageRole
package require mycnf

namespace eval ::myroles {

}

proc ::myroles::runRoleActions {} {

  set myip [::confutil::getMyIp]

  # write my.cnf file.
  if {[::confutil::ipExists $myip]} {
    ::mycnf::writeToDisk $myip
    ::confutil::writeConfigIni
  }

  set node::ymlDict [::confutil::getNodeConfig NDB_MGMD $myip]

  if {[string length $node::ymlDict] > 0} {
    ::ManageRole::run $::ymlDict $node::ymlDict
  }

#  if {[lsearch -exact [dict get $::ymlDict dataNodeIps] $myip] != -1} {
#      #run dataNodeRoleAction
#  }

#  foreach mdic [dict get $::ymlDict mysqlNodeIps] {
#    if {[dict get $mdic ip] eq $myip} {
      #run mysqlNodeRoleAction
#      break;
#    }
#  }
}
