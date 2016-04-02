#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package provide ManageRole 1.0

namespace eval ::ManageRole {
  variable configIni {
[NDB_MGMD DEFAULT]
Portnumber=1186

[NDB_MGMD]
NodeId=49
HostName=192.168.33.50
DataDir=/root/MySQL_Cluster/49/
Portnumber=1186

[NDB_MGMD]
NodeId=52
HostName=192.168.33.51
DataDir=/root/MySQL_Cluster/52/
Portnumber=1186

[TCP DEFAULT]
SendBufferMemory=4M
ReceiveBufferMemory=4M

[NDBD DEFAULT]
BackupMaxWriteSize=1M
BackupDataBufferSize=16M
BackupLogBufferSize=4M
BackupMemory=20M
BackupReportFrequency=10
emReportFrequency=30
LogLevelStartup=15
LogLevelShutdown=15
LogLevelCheckpoint=8
LogLevelNodeRestart=15
DataMemory=1M
IndexMemory=1M
axNoOfTables=4096
axNoOfTriggers=3500
NoOfReplicas=2
StringMemory=25
DiskPageBufferMemory=64M
SharedGlobalMemory=20M
LongMessageBuffer=32M
axNoOfConcurrentTransactions=16384
BatchSizePerLocalScan=512
FragmentLogFileSize=64M
NoOfFragmentLogFiles=16
RedoBuffer=32M
axNoOfExecutionThreads=2
StopOnError=false
LockPagesInMainMemory=1
TimeBetweenEpochsTimeout=32000
TimeBetweenWatchdogCheckInitial=60000
TransactionInactiveTimeout=60000
HeartbeatIntervalDbDb=15000
HeartbeatIntervalDbApi=15000}
}

proc ::ManageRole::mgmdSeg {host nodeId datadir} {
	set mapDic [list @host@ $host @nodeId@ $nodeId @datadir@ $datadir]
	set tpl {[NDB_MGMD]
NodeId=@nodeId@
HostName=@host@
DataDir=@datadir@/@nodeId@/
Portnumber=1186}
	set cmdDic [dict create]
	dict set cmdDic host $host
	dict set cmdDic cmd [string map $mapDic "/usr/sbin/ndb_mgmd --initial --ndb-nodeid=@nodeId@ --config-dir=@datadir@/@nodeId@/ --config-file=@datadir@/@nodeId@/config.ini"]
	dict set cmdDic configFile $datadir/$nodeId/config.ini
	dict set cmdDic cmdType mgmd
	lappend ::cmdList $cmdDic
	split [string map $mapDic $tpl] \n
}

# all manage node's config.ini are same.
proc ::ManageRole::createIni {configDict} {
  set resultLines {}

  set NDB_MGMD_REACHED 0
  set NDB_MGMD_INSERTED 0

  set manageNodeIps [dict get $configDict manageNodeIps]

  set manageNodeDataDir [dict get $configDict manageNodeDataDir]

  set manageNodeIdStart 50

  variable configIni

  foreach line [split $configIni \n] {
  	if {([string first \[ $line] >= 0) && $NDB_MGMD_REACHED} {
  		set NDB_MGMD_REACHED  0
  		if {! $NDB_MGMD_INSERTED} {
  			set NDB_MGMD_INSERTED 1
  			foreach mht $manageNodeIps {
  				foreach mline [mgmdSeg $mht [incr manageNodeIdStart] $manageNodeDataDir] {
  					lappend resultLines $mline
  				}
  			}
  		}
  	}

  	if {$line eq {[NDB_MGMD]}} {
  		set NDB_MGMD_REACHED 1
  	}

  	if {! $NDB_MGMD_REACHED} {
  		lappend resultLines $line
  	}
  }
}

proc ::ManageRole::run {configDict nf ip} {
  
}
