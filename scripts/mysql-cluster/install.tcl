#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package require yaml

set ::baseDir [file join [file dirname [info script]] ..]
lappend auto_path $::baseDir

package require AppDetecter

if {$argc != 1} {
  puts stderr "please add config file parameter."
  exit 1
}

set cfgFile [file join $::baseDir mysql-cluster [lindex $argv 0]]

if {! [string match *.yml $cfgFile]} {
  set cfgFile "$cfgFile.yml"
}

catch {[set configDict [::yaml::yaml2dict -file $cfgFile]]} msg o

if {! ([dict get $o -errorcode] eq {NONE})} {
  puts stderr $msg
  exit 1
}

if {! [::AppDetecter::isInstalled ndb_mgmd]} {
  package require MysqlClusterInstaller
  ::MysqlClusterInstaller::install /opt/install-tmp
}


package require myroles

::myroles::runRoleActions $configDict
