#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package provide confutil 1.0

namespace eval ::confutil {

}

proc ::confutil::ipExists {configDict ip} {
  dict for {k nodeCfg} $configDict {
    dict with nodeCfg {
      foreach n $nodes {
        if {[dict get $n ip] eq $ip} {
          return 1
        }
      }
    }
  }
  return 0
}

#return
proc ::confutil::getNodeConfig {configDict nt ip} {
  dict for {k nodeCfg} $configDict {
    if {$k eq $nt} {
      dict with nodeCfg {
        foreach n $nodes {
          if {[dict get $n ip] eq $ip} {
            return $n
          }
        }
      }
    }
  }
  return {}
}
