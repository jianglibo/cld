package provide mycnf 1.0

package require CommonUtil

package require confutil

namespace eval ::mycnf {
  if {[catch {open [file join $::baseDir mysql-cluster templates my.cnf]} fid o]} {
    puts stderr $fid
    exit 1
  } else {
    set lines [list]
    while {[gets $fid line] >= 0} {
      lappend lines $line
    }
    variable mycnfDic [::CommonUtil::splitSeg $lines {\[*]}]
    close $fid
  }
}

proc ::mycnf::writeToDisk {dest} {
#  set iniFile [dict get $::ymlDict ConfigFile path]
  set configDir [file dirname $dest]
  variable mycnfDic

  if {! [file exists $configDir]} {
    exec mkdir -p $configDir
  }

  if {[catch {open $dest w} fid o]} {
    puts stderr $fid
    exit 1
  } else {
    dict for {k v} $mycnfDic {
      foreach line $v {
          puts $fid $line
      }
    }
    close $fid
  }
}


# {[mysqld]} {[ndbd]} {[ndb_mgm]} {[ndb_mgmd]}
proc ::mycnf::substitute {} {
  variable mycnfDic

  set roles [::confutil::getMyRoles]

  set mgmHosts [join [::CommonUtil::getMgmHosts $::ymlDict] ,]
  dict for {k v} $mycnfDic {
    switch $k {
      {[mysqld]} {

      }
      {[ndbd]} {
        set nodeid [::confutil::getNodeId {NDBD}]
        if {[string length $nodeid] > 0} {
          set kvDict [dict create {connect-string}  "nodeid=$nodeid,$mgmHosts"]
          variable mycnfDic [::CommonUtil::replaceItem $mycnfDic $k $kvDict]
        }
      }
      {[ndb_mgm]} {
        set nodeid [::confutil::getNodeId {NDB_MGMD}]
        if {[string length $nodeid] > 0} {
          set kvDict [dict create {connect-string}  "nodeid=$nodeid,$mgmHosts"]
          variable mycnfDic [::CommonUtil::replaceItem $mycnfDic $k $kvDict]
        }
      }
    }
  }
}


proc ::mycnf::prepareDict {myip} {
  set sublines [list]

  foreach line $tpl {

  }

  set subDict [dict create]
  set nodesCfg [dict get $::ymlDict NDB_MGMD nodes]
  set connectString [list]
  foreach node $nodesCfg {
    set hn [dict get $node HostName]
    if {$hn eq $myip} {
      set NodeId [dict get $node NodeId]
    }
    lappend connectString "$hn:[dict get $node PortNumber]"
  }
  dict set subDict connect-string "nodeid=$NodeId,[join $connectString ,]"
  dict set subDict config-file [dict get $::ymlDict ConfigFile path]
  return $subDict
}
