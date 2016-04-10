package provide CommonUtil 1.0

package require yaml

namespace eval ::CommonUtil {

}

proc ::CommonUtil::dictItemExists {} {

}

proc ::CommonUtil::replace {lines kvDic} {
  set keys [dict keys $kvDic]
  set result [list]

  foreach line $lines {
    foreach k $keys {
      if {[string first "$k=" $line] == 0} {
        set line [string replace $line [string length "$k="] end [dict get $kvDic $k]]
        break
      }
    }
    lappend result $line
  }
  return $result
}

proc ::CommonUtil::replaceItem {contentDic contentKey kvDic} {
  set lines [dict get $contentDic $contentKey]
  set lines [replace $lines $kvDic]
  dict set contentDic $contentKey $lines
  return $contentDic
}

proc ::CommonUtil::splitSeg {lines matcher} {
  set rd [dict create]
  set lastMatch {}
  set seg [list]
  foreach line $lines {
    if {[string match $matcher $line]} {
      if {[string length $lastMatch] > 0} {
        dict set rd $lastMatch $seg
        set seg [list]
        set lastMatch $line
      } else {
        set lastMatch $line
      }
    }
    lappend seg $line
  }
  if {[llength $seg] > 0} {
    dict set rd $lastMatch $seg
  }
  return $rd
}

proc ::CommonUtil::getMgmHosts {ymlDict} {
  set hosts [list]
  dict for {k v} $ymlDict {
    switch $k {
      {NDB_MGMD} {
        foreach n [dict get $v nodes] {
          lappend hosts "[dict get $n HostName]:[dict get $n PortNumber]"
        }
      }
    }
  }
  return $hosts
}

proc ::CommonUtil::loadNormalizedYmlDic {fn} {
  ::CommonUtil::normalizeYmlCfg [::CommonUtil::loadYaml $fn]
}

proc ::CommonUtil::loadYaml {fn} {
  catch {[set dt [::yaml::yaml2dict -file $fn]]} msg o
  if {! ([dict get $o -errorcode] eq {NONE})} {
    puts stderr $msg
    exit 1
  }
  return $dt
}

proc ::CommonUtil::killByName {pname} {
  catch {set psResult [exec ps -A | grep $pname]} msg o
  if {[dict get $o -code] != 0} {
    return;
  }
  if {[string length $psResult] > 0} {
    set psResult [split $psResult  \n]
  }


  foreach p $psResult {
    set pid [string trim [lindex $p 0]]
    if {[string length $pid] > 0} {
      puts stdout $pid
      catch {exec kill -s 9 $pid} msg o
    }
  }
}

proc ::CommonUtil::killYum {} {
  killByName yum
  catch {exec rm /var/run/yum.pid} msg o
}

proc ::CommonUtil::normalizeYmlCfg {dic} {
  set newnodes [list]
  set mysqldSeg [dict get $dic MYSQLD]
  set baseDataDir [dict get $mysqldSeg DataDir]
  foreach n [dict get $mysqldSeg nodes] {
    foreach ins [dict get $n instances] {
      set nn [dict create]
      dict set nn HostName [dict get $n HostName]
      dict set nn DataDir "${baseDataDir}/[dict get $ins NodeId]"
      dict for {k v} $ins {
        dict set nn $k $v
      }
      lappend newnodes $nn
    }
  }
  dict set dic MYSQLD nodes $newnodes

  dict for {k v} $dic {
    switch $k {
      NDB_MGMD -
      NDBD -
      MYSQLD {
        set segKeys [dict keys $v]

        set newnodes [list]
        foreach n [dict get $v nodes] {
          foreach sk $segKeys {
            if {! [expr {$sk eq {nodes}}]} {
              if {! [dict exists $n $sk]} {
                dict set n $sk [dict get $v $sk]
              }
            }
          }
          lappend newnodes $n
        }
        dict set dic $k nodes $newnodes
      }
    }
  }
  return $dic
}
