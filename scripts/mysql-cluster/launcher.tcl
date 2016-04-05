package require yaml

package require MysqlClusterInstaller
package require myroles
package require confutil
package require CommonUtil

if {! [dict exists $::rawParamDict profile]} {
  puts stderr "parameter --profile doesn't exists!"
  exit 1
}

set cfgFile [file join $::baseDir mysql-cluster [dict get $::rawParamDict profile]]

if {! [string match *.yml $cfgFile]} {
  set cfgFile "$cfgFile.yml"
}

set ::ymlDict [::CommonUtil::loadYaml $cfgFile]

proc normalizeYmlDict {} {
  set newnodes [list]
  foreach n [dict get $::ymlDict MYSQLD nodes] {
    foreach ins [dict get $n instances] {
      set nn [dict create]
      dict set nn HostName [dict get $n HostName]
      dict for {k v} $ins {
        dict set nn $k $v
      }
      lappend newnodes $nn
    }
  }
  dict set ::ymlDict MYSQLD nodes $newnodes
}

normalizeYmlDict

puts [dict get $::ymlDict MYSQLD]

switch [dict get $::rawParamDict action] {
  install {if {[string length [::confutil::getMyIp]] > 0 } {
              ::MysqlClusterInstaller::install /opt/install-tmp
            } else {
              puts stderr "host ip not exists in [dict get $::rawParamDict profile]"
              exit 1
            }
          }
    default {
      ::myroles::runRoleActions
    }
}
