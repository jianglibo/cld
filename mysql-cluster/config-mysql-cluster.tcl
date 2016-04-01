#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}
#dox2unix

if {0} {
	before install mysqlcluster,	we must know how many machines to install, how many apiNodes and sqlNodes to run on single machine.
	as a convenience, we run one manageNode per machine, run one dataNode per machine.and run multiple sqlNode(apiNode) on one machine.

	every role need different config file and start command.
	for management node:
	config.ini
	start command
}

package require yaml

lappend auto_path [file dirname [info script]]

set scriptDir [file dirname [info script]]
lappend auto_path $scriptDir

if {$argc != 1} {
  puts stderr "please add config file parameter."
  exit 1
}

set cfgFile [file join $scriptDir [lindex $argv 0]]
catch {[set configDict [::yaml::yaml2dict -file $cfgFile]]} msg o

if {! ([dict get $o -errorcode] eq {NONE})} {
  puts stderr $msg
  exit 1
}

set mgmhosts $params(mgmhosts)]

if {[string length $mgmhosts] == 0} {
	puts stderr "mgmhosts params are required."
	exit 1
}

set mgmhosts [split $mgmhosts ,]

puts $params(mgmhosts)

set mgmNodeIdStart 50

set cmdList [list]


set machineIps [list]

set ipaddr [exec ip addr]

foreach line [split $ipaddr \n] {
  set mt {}
  set ip {}
  regexp {inet\s+(\d+\.\d+\.\d+\.\d+)} $line mt ip
  if {[string length $ip] > 0} {
    lappend machineIps $ip
  }
}

set machineMgmIp {}

foreach ip $machineIps {
  if {[lsearch -exact $mgmhosts $ip] != -1} {
    set machineMgmIp $ip
  }
}

set configIni {
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

proc mgmdSeg {host nodeId datadir} {
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

set resultLines {}

set NDB_MGMD_REACHED 0
set NDB_MGMD_INSERTED 0

foreach line [split $configIni \n] {
	if {([string first \[ $line] >= 0) && $NDB_MGMD_REACHED} {
		set NDB_MGMD_REACHED  0
		if {! $NDB_MGMD_INSERTED} {
			set NDB_MGMD_INSERTED 1
			foreach mht $mgmhosts {
				foreach mline [mgmdSeg $mht [incr mgmNodeIdStart] $params(mgmdatadir)] {
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

# only need one file ,and copy to hosts.
#foreach cfgFile $configIniFiles {
#}

set machineMgmCmd ""

foreach cmd $cmdList {
	set hosttmp [dict get $cmd host]
	set cmdTypetmp [dict get $cmd cmdType]
	if { ($hosttmp eq $machineMgmIp) && ($cmdTypetmp eq {mgmd}) } {
		set machineMgmCmd $cmd
	}
}

if {[string length machineMgmCmd] > 0 } {
	set cfgFile [dict get $machineMgmCmd configFile]
	if {! [file exists [file dirname $cfgFile] ]} {
		exec mkdir -p [file dirname $cfgFile]
	}
	if { [catch {open $cfgFile w} fid] } {
		puts stderr "Could not open $cfgFile for writing\n$fid"
		exit 1
	} else {
		puts $fid
		foreach line $resultLines {
			puts $fid $line
		}
		close $fid
	}
}


#foreach line $cmdList {
#	puts $line
#}

puts $machineMgmIp
#puts [mgmdSeg 192.168.33.51]
