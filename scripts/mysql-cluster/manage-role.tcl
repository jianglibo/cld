package provide ManageRole 1.0

package require confutil

namespace eval ::ManageRole {
  set role NDB_MGMD
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
proc ::ManageRole::run {} {

  variable role

  set commandTpl "/usr/sbin/ndb_mgmd --ndb-nodeid=@NodeId@ --initial --config-dir=@DataDir@/@NodeId@/ --config-file=@ConfigFile@"

  set thisNodeId [::confutil::getNodeId $role]

  set DataDir [dict get $::ymlDict $role DataDir]

  if {! [file exist [file join $DataDir $thisNodeId]]} {
    exec mkdir -p [file join $DataDir $thisNodeId]
  }

  switch [dict get $::rawParamDict action] {
    start {
      set kvDic [list @NodeId@ $thisNodeId @DataDir@ $DataDir @ConfigFile@ [dict get $::ymlDict ConfigFile path]]
      set execCmd [string map $kvDic $commandTpl]
      puts stdout "start invoking remote cmd: $execCmd"
      exec {*}$execCmd
    }
  }
}
