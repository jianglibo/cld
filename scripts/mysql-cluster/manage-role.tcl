package provide ManageRole 1.0

package require confutil

namespace eval ::ManageRole {
}

proc ::ManageRole::writeToDisk {configFile configLines} {

  set configDir [file dirname $configFile]

  if {! [file exists $configDir]} {
    exec mkdir -p $configDir
  }

  if {[catch {open $configFile w} fid o]} {
    puts stderr $fid
    exit 1
  } else {
    foreach line $configLines {
        puts $fid $line
    }
    close $fid
  }
}

# according to yml config, create config.ini, write to disk, change folder permission
# execute generated command.
proc ::ManageRole::run {ymlDict nodeYmlDict} {
  set commandTpl "/usr/sbin/ndb_mgmd --ndb-nodeid=@NodeId@ --initial --config-dir=@DataDir@/@NodeId@/ --config-file=@DataDir@/@NodeId@/config.ini"

  set configLines [::confutil::getConfigIniLines [file join $::baseDir mysql-cluster templates manage-node config.ini] $ymlDict]

  set thisNodeId [dict get $nodeYmlDict NodeId]

  set DataDir [dict get $ymlDict NDB_MGMD DataDir]

  set configFile [file join $DataDir $thisNodeId config.ini]

  writeToDisk $configFile $configLines

  switch [dict get $::rawParamDict action] {
    start {
      set mapDic [list @NodeId@ $thisNodeId @DataDir@ $DataDir]
      set execCmd [string map $mapDic $commandTpl]
      puts stdout "start invoking remote cmd: $execCmd"
      exec {*}$execCmd
    }
  }

  #createIni $ymlDict stdout

}
