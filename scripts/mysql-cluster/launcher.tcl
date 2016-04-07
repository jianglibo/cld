package require yaml

package require MysqlClusterInstaller
package require CommonUtil

if {! [dict exists $::rawParamDict profile]} {
  puts stderr "parameter --profile doesn't exists!"
  exit 1
}

set cfgFile [file join $::baseDir mysql-cluster [dict get $::rawParamDict profile]]

if {! [string match *.yml $cfgFile]} {
  set cfgFile "$cfgFile.yml"
}

set ::ymlDict [::CommonUtil::loadNormalizedYmlDic $cfgFile]
package require confutil
package require mycnf
package require confini
package require ManageRole

set myroles [::confutil::getMyRoles]

if {! [llength $myroles]} {
  puts stderr "host ip not exists in [dict get $::rawParamDict profile]"
  exit 1
}

dict for {k v} $::ymlDict {
  if {[dict exists $v DataDir]} {
    catch {exec mkdir -p [dict get $v DataDir]} msg o
  }

#  if {[dict exists $v nodes]} {
#      foreach n [dict get $v nodes] {
#          if {[dict exists $n DataDir]} {
#            catch {exec mkdir -p [dict get $n DataDir]} msg o
#          }
#      }
#  }
}

switch [dict get $::rawParamDict action] {
  install {
    ::MysqlClusterInstaller::install /opt/install-tmp
  }
  config {
    # write my.cnf file. always need.
    ::mycnf::writeToDisk /etc/my.cnf 1
    ::confini::writeToDisk [dict get $::ymlDict ConfigFile path] 1
  }
  default {
    if {[lsearch -exact $myroles NDB_MGMD] != -1} {
      ::ManageRole::run
    } else {
      puts stdout "not a NDB_MGMD node, skipping"
    }
  }
}
