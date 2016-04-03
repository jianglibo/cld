#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

package require yaml

package require AppDetecter

if {! [dict exists $::rawParamDict profile]} {
  puts stderr "parameter --profile doesn't exists!"
  exit 1
}

set cfgFile [file join $::baseDir mysql-cluster [dict get $::rawParamDict profile]]

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
