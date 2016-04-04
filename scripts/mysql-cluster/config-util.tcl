#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package provide confutil 1.0

namespace eval ::confutil {
  variable allIps
}

proc ::confutil::getAllIps {ymlDict} {
    if {! [info exists ::confutil::allIps]} {
      set ips [list]
      dict for {k nodeCfg} $ymlDict {
        if {[dict exists $nodeCfg nodes]} {
          foreach node [dict get $nodeCfg nodes] {
            lappend ips [dict get $node HostName]
          }
        }
      }
      variable allIps [lsort -unique $ips]
    }
}

proc ::confutil::ipExists {ymlDict ips} {
  variable allIps
  getAllIps $ymlDict
  foreach ip $ips {
    if {[lsearch -exact $allIps $ip] != -1} {
      return 1
    }
  }
  return 0
}

#return
proc ::confutil::getNodeConfig {ymlDict nt ip} {
  dict for {k nodeCfg} $ymlDict {
    if {$k eq $nt} {
      dict with nodeCfg {
        foreach n $nodes {
          if {[dict get $n HostName] eq $ip} {
            return $n
          }
        }
      }
    }
  }
  return {}
}

proc ::confutil::getConfigIniLines {iniFile ymlDict} {
  parseIni $iniFile
  return [concat [NDB_MGMD_DEFAULT $ymlDict] [NDB_MGMD $ymlDict] [NDBD_DEFAULT $ymlDict] [NDBD $ymlDict] [MYSQLD_DEFAULT $ymlDict] [MYSQLD $ymlDict] [API $ymlDict]]
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

proc ::confutil::replace {header tpl cfg} {
  set keys [dict keys $cfg]
  set result [list $header]

  foreach line $tpl {
    foreach k $keys {
      if {[string first "$k=" $line] == 0} {
        set line [string replace $line [string length "$k="] end [dict get $cfg $k]]
        break
      }
    }
    lappend result $line
  }
  return $result
}

proc ::confutil::NDB_MGMD_DEFAULT {ymlDict} {
  variable iniDic
  set tpl [dict get $iniDic {[NDB_MGMD DEFAULT]}]
  set cfg [dict get $ymlDict NDB_MGMD_DEFAULT]
  replace {[NDB_MGMD DEFAULT]} $tpl $cfg
}

proc ::confutil::NDB_MGMD {ymlDict} {
  variable iniDic
  set tpl [dict get $iniDic {[NDB_MGMD]}]
  set NDB_MGMD [dict get $ymlDict NDB_MGMD]
  set DataDir [dict get $NDB_MGMD DataDir]

  set result [list]

  foreach node  [dict get $NDB_MGMD nodes] {
    dict set node DataDir $DataDir
    set result [concat $result [replace {[NDB_MGMD]} $tpl $node]]
  }
  return $result
}

proc ::confutil::NDBD_DEFAULT {ymlDict} {
  variable iniDic
  set tpl [dict get $iniDic {[NDBD DEFAULT]}]
  set cfg [dict get $ymlDict NDBD_DEFAULT]
  replace {[NDBD DEFAULT]} $tpl $cfg
}

proc ::confutil::NDBD {ymlDict} {
  variable iniDic
  set tpl [dict get $iniDic {[NDBD]}]
  set NDBD [dict get $ymlDict NDBD]
  set DataDir [dict get $NDBD DataDir]


  set result [list]

  foreach node  [dict get $NDBD nodes] {
    dict set node DataDir $DataDir
    set result [concat $result [replace {[NDBD]} $tpl $node]]
  }
  return $result
}

proc ::confutil::MYSQLD_DEFAULT {ymlDict} {
  variable iniDic
  set tpl [dict get $iniDic {[MYSQLD DEFAULT]}]
  set cfg [dict get $ymlDict MYSQLD_DEFAULT]
  replace {[MYSQLD DEFAULT]} $tpl $cfg
}

proc ::confutil::MYSQLD {ymlDict} {
  variable iniDic
  set tpl [dict get $iniDic {[MYSQLD]}]
  set MYSQLD [dict get $ymlDict MYSQLD]
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
    set result [concat $result [replace {[MYSQLD]} $tpl $sub]]
  }
  return $result
}

proc ::confutil::API {ymlDict} {
  variable iniDic
  set tpl [dict get $iniDic {[API]}]
  set API [dict get $ymlDict API]
  set result [list]

  foreach node  $API {
    set result [concat $result [replace {[API]} $tpl $node]]
  }
  return $result
}
