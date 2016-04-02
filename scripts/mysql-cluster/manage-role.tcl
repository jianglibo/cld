package provide ManageRole 1.0

namespace eval ::ManageRole {
  set configDir [file join $::baseDir mysql-cluster templates manage-node]
  if {[catch {open [file join $configDir config.ini]} fid o] } {
    puts stderr $fid
    exit 1
  } else {
    variable configIni [read $fid]
    close $fid
  }

  if {[catch {open [file join $configDir ndb-mgmd-seg.ini]} fid o] } {
    puts stderr $fid
    exit 1
  } else {
    variable ndbMgmdSegTpl [read $fid]
    close $fid
  }

  if {[catch {open [file join $configDir command.tpl]} fid o] } {
    puts stderr $fid
    exit 1
  } else {
    variable commandTpl [read $fid]
    close $fid
  }
}

proc ::ManageRole::mgmdSeg {configDict} {

	variable ndbMgmdSegTpl

  set manageNodes [dict get $configDict manageNodes]
  set dataDir [dict get $manageNodes dataDir]

  set result ""

  foreach node [dict get $manageNodes nodes] {
    set mapDic [list @ip@ [dict get $node ip] @nodeId@ [dict get $node nodeIds] @datadir@ $dataDir]
    set result "$result\n[string map $mapDic $ndbMgmdSegTpl]"
  }

  set result "$result\n"

#  variable commandTpl
#	set cmdDic [dict create]
#	dict set cmdDic ip $ip
#	dict set cmdDic cmd [string map $mapDic $commandTpl]
#	dict set cmdDic configFile $datadir/$nodeId/config.ini
#	dict set cmdDic cmdType mgmd
#	lappend ::cmdList $cmdDic
	split $result \n
}

# all manage node's config.ini are same.
proc ::ManageRole::createIni {configDict fid} {
  variable configIni

  set NDB_MGMD_REACHED 0
  set NDB_MGMD_INSERTED 0

  foreach line [split $configIni \n] {
    if {([string first \[ $line] >= 0) && $NDB_MGMD_REACHED} {
      set NDB_MGMD_REACHED  0
      if {! $NDB_MGMD_INSERTED} {
        set NDB_MGMD_INSERTED 1
          foreach mline [mgmdSeg $configDict] {
            puts $fid $mline
          }
      }
    }

    if {$line eq {[NDB_MGMD]}} {
      set NDB_MGMD_REACHED 1
    }

    if {! $NDB_MGMD_REACHED} {
      puts $fid $line
    }
  }
}

proc ::ManageRole::configIniFid {dataDir thisNodeId} {
  set configDir [file join $dataDir $thisNodeId]

  if {! [file exists $configDir]} {
    exec mkdir -p $configDir
  }

  set configFile [file join $configDir config.ini]

  if {[catch {[open $configFile w]} fid o]} {
    puts stderr $fid
    exit 1
  } else {
    return $fid
  }
}

# according to yml config, create config.ini, write to disk, change folder permission
# execute generated command.
proc ::ManageRole::run {configDict nodeCfg} {
  variable commandTpl

  set thisNodeId [dict get $nodeCfg nodeIds]
  set dataDir [dict get $configDict manageNodes dataDir]

  #set fid [configIniFid $dataDir $thisNodeId]
  #createIni $configDict $nodeCfg $fid
  #close $fid

  createIni $configDict stdout

  set mapDic [list @nodeId@ $thisNodeId @datadir@ $dataDir]

  set execCmd [string map $mapDic $commandTpl]
  
  puts $execCmd
}
