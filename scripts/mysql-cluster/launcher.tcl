package require yaml

package require MysqlClusterInstaller
package require myroles

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

switch [dict get $::rawParamDict action] {
  install {if {[string length [::myroles::getMyIp $configDict]] > 0 } {
              ::MysqlClusterInstaller::install /opt/install-tmp
            } else {
              puts stderr "host ip not exists in $configFile"
              exit 1
            }
          }
    default {
      ::myroles::runRoleActions $configDict
    }
}
