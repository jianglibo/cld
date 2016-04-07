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

proc ::CommonUtil::normalizeYmlCfg {dic} {
  set newnodes [list]
  foreach n [dict get $dic MYSQLD nodes] {
    foreach ins [dict get $n instances] {
      set nn [dict create]
      dict set nn HostName [dict get $n HostName]
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
