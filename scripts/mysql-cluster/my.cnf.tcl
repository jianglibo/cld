package provide mycnf 1.0

package require CommonUtil

namespace eval ::mycnf {
  if {[catch {open [file join $::baseDir mysql-cluster templates my.cnf]} fid o]} {
    puts stderr $fid
    exit 1
  } else {
    set lines [list]
    while {[gets $fid line] >= 0} {
      lappend lines $line
    }
    variable tpl $lines
    close $fid
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

proc ::mycnf::writeToDisk {myip} {
  variable tpl
  set subDict [prepareDict $myip]
  set result [::CommonUtil::replace {} $tpl $subDict]
  if {[catch {open /etc/my.cnf w} fid o]} {
    puts stderr $fid
    exit 1
  } else {
    foreach line $result {
      puts $fid $line
    }
    close $fid
  }
}
