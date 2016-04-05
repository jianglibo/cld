#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

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

proc ::confutil::writeConfigIni {} {
  set configLines [getConfigIniLines [file join $::baseDir mysql-cluster templates manage-node config.ini] $::ymlDict]
  set iniFile [dict get $::ymlDict ConfigFile path]

  set configDir [file dirname $iniFile]

  if {! [file exists $configDir]} {
    exec mkdir -p $configDir
  }

  if {[catch {open $iniFile w} fid o]} {
    puts stderr $fid
    exit 1
  } else {
    foreach line $configLines {
        puts $fid $line
    }
    close $fid
  }
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

#return
proc ::confutil::getNodeConfigs {ip} {
  set nodeDict [dict create NDB_MGMD [dict get $::ymlDict NDB_MGMD nodes] NDBD [dict get $::ymlDict NDBD nodes] MYSQLD [dict get $::ymlDict MYSQLD nodes] API [dict get $::ymlDict API]]

  dict for {k nodes} $nodeDict {
    foreach n $nodes {
      if {[dict get $n HostName] eq $ip} {
          return $n
      }
    }
  }
  return {}
}

proc ::confutil::getConfigIniLines {iniFile} {
  parseIni $iniFile
  return [concat [NDB_MGMD_DEFAULT] [NDB_MGMD] [NDBD_DEFAULT] [NDBD] [MYSQLD_DEFAULT] [MYSQLD] [API]]
}

# parse to a dict.
proc ::confutil::parseIni {iniFile} {
  if {[catch {open $iniFile} fid o]} {
    puts stderr $fid
    exit 1
  } else {
    set FirstReach 0
    set seq [list]
    set dic [dict create]
    set prevSeqName {}

    while {[gets $fid line] >= 0} {
      if {[string match \\\[*\] $line]} {
        set FirstReach 1
        if {[llength $seq] > 0} {
          dict set dic $lastSeqName $seq
          set seq [list]
        }
        set lastSeqName $line
      } else {
        if {$FirstReach} {
          lappend seq $line
        }
      }
    }
    close $fid
    dict set dic $lastSeqName $seq
    variable iniDic $dic
  }
}

proc ::confutil::NDB_MGMD_DEFAULT {} {
  variable iniDic
  set tpl [dict get $iniDic {[NDB_MGMD DEFAULT]}]
  set cfg [dict get $::ymlDict NDB_MGMD_DEFAULT]
  ::CommonUtil::replace {[NDB_MGMD DEFAULT]} $tpl $cfg
}

proc ::confutil::NDB_MGMD {} {
  variable iniDic
  set tpl [dict get $iniDic {[NDB_MGMD]}]
  set NDB_MGMD [dict get $::ymlDict NDB_MGMD]
  set DataDir [dict get $NDB_MGMD DataDir]

  set result [list]

  foreach node  [dict get $NDB_MGMD nodes] {
    dict set node DataDir $DataDir
    set result [concat $result [::CommonUtil::replace {[NDB_MGMD]} $tpl $node]]
  }
  return $result
}

proc ::confutil::NDBD_DEFAULT {} {
  variable iniDic
  set tpl [dict get $iniDic {[NDBD DEFAULT]}]
  set cfg [dict get $::ymlDict NDBD_DEFAULT]
  ::CommonUtil::replace {[NDBD DEFAULT]} $tpl $cfg
}

proc ::confutil::NDBD {} {
  variable iniDic
  set tpl [dict get $iniDic {[NDBD]}]
  set NDBD [dict get $::ymlDict NDBD]
  set DataDir [dict get $NDBD DataDir]


  set result [list]

  foreach node  [dict get $NDBD nodes] {
    dict set node DataDir $DataDir
    set result [concat $result [::CommonUtil::replace {[NDBD]} $tpl $node]]
  }
  return $result
}

proc ::confutil::MYSQLD_DEFAULT {} {
  variable iniDic
  set tpl [dict get $iniDic {[MYSQLD DEFAULT]}]
  set cfg [dict get $::ymlDict MYSQLD_DEFAULT]
  ::CommonUtil::replace {[MYSQLD DEFAULT]} $tpl $cfg
}

proc ::confutil::MYSQLD {} {
  variable iniDic
  set tpl [dict get $iniDic {[MYSQLD]}]
  set MYSQLD [dict get $::ymlDict MYSQLD]
  set DataDir [dict get $MYSQLD DataDir]

  set result [list]

  set subs [list]

  foreach node  [dict get $MYSQLD nodes] {
    foreach ins [dict get $node instances] {
      dict set ins DataDir $DataDir
      dict set ins HostName [dict get $node HostName]
      lappend subs $ins
    }
  }

  foreach sub $subs {
    set result [concat $result [::CommonUtil::replace {[MYSQLD]} $tpl $sub]]
  }
  return $result
}

proc ::confutil::API {} {
  variable iniDic
  set tpl [dict get $iniDic {[API]}]
  set API [dict get $::ymlDict API]
  set result [list]

  foreach node  $API {
    set result [concat $result [::CommonUtil::replace {[API]} $tpl $node]]
  }
  return $result
}
