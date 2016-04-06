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

proc ::mycnf::writeToDisk {dest {needSubstitute 0}} {

  if {$needSubstitute} {
    substitute
  }
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
      {[ndb_mgmd]} {
          set kvDict [dict create config-file  [dict get $::ymlDict ConfigFile path]]
          variable mycnfDic [::CommonUtil::replaceItem $mycnfDic $k $kvDict]
      }
    }
  }
}
