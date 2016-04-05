package provide confutil 1.0
package require CommonUtil

namespace eval ::confutil {
  variable allIps
}

proc ::confutil::getAllIps {} {
    if {! [info exists ::confutil::allIps]} {
      set ips [list]
      dict for {k nodeCfg} $::ymlDict {
        if {[dict exists $nodeCfg nodes]} {
          foreach node [dict get $nodeCfg nodes] {
            lappend ips [dict get $node HostName]
          }
        }
      }
      variable allIps [lsort -unique $ips]
    }
}

proc ::confutil::ipExists {ips} {
  variable allIps
  getAllIps
  foreach ip $ips {
    if {[lsearch -exact $allIps $ip] != -1} {
      return 1
    }
  }
  return 0
}

proc ::confutil::getMyIp {} {
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
    if {[ipExists $ip]} {
      return $ip
    }
  }
  return {}
}

proc ::confutil::getMyRoles {ip} {
  set nodeDict [dict create]

  foreach role {NDB_MGMD NDBD MYSQLD} {
    dict set nodeDict $role [dict get $::ymlDict $role nodes]
  }

  dict set nodeDict API [dict get $::ymlDict API]

  set mr [list]
  dict for {k nodes} $nodeDict {
    foreach n $nodes {
      if {[dict get $n HostName] eq $ip} {
        lappend mr $k
      }
    }
  }
  return $mr
}
