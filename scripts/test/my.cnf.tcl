package require tcltest 2.2
eval ::tcltest::configure $::argv

set ::baseDir [file join [file dirname [info script]] ..]

lappend auto_path $::baseDir

package require CommonUtil

set ::ymlDict [::CommonUtil::normalizeYmlCfg [::CommonUtil::loadYaml [file join $::baseDir test fixtures local-profile.yml]]]

package require mycnf

namespace eval ::example::test {

    namespace import ::tcltest::*
    testConstraint X [expr {1}]

    variable SETUP {

    }
    variable CLEANUP {#common cleanup code}

    test has-split-to-dict {} -constraints X -setup $SETUP -body {
      return [dict keys $::mycnf::mycnfDic]
    } -cleanup $CLEANUP -match exact -result {{[mysqld]} {[ndbd]} {[ndb_mgm]} {[ndb_mgmd]}}

    test before-substituted-content {} -constraints X -setup $SETUP -body {
      set ll [list]
      dict for {k v} $::mycnf::mycnfDic {
        lappend ll [llength $v]
      }
      return $ll
    } -cleanup $CLEANUP -match exact -result {36 4 4 2}

    ::mycnf::substitute

    test has-substituted {} -constraints X -setup $SETUP -body {
      return [dict keys $::mycnf::mycnfDic]
    } -cleanup $CLEANUP -match exact -result {{[mysqld]} {[ndbd]} {[ndb_mgm]} {[ndb_mgmd]}}

    test when-not-has-ndbd-role {} -constraints X -setup $SETUP -body {
      set ndbdInMycnfLines [dict get $::mycnf::mycnfDic {[ndbd]}]
      foreach line $ndbdInMycnfLines {
        if {[string first connect-string= $line] == 0} {
          return $line
        }
      }

    } -cleanup $CLEANUP -match exact -result {connect-string=nodeid=b,192.168.33.50:14500}

    test when-has-ndb_mgmd-role {} -constraints X -setup $SETUP -body {
      set ndbdInMycnfLines [dict get $::mycnf::mycnfDic {[ndb_mgm]}]
      foreach line $ndbdInMycnfLines {
        if {[string first connect-string= $line] == 0} {
          return $line
        }
      }

    } -cleanup $CLEANUP -match exact -result {connect-string=nodeid=50,192.168.33.50:41500,192.168.33.51:41500}

    ::mycnf::writeToDisk [file join $::baseDir test fixturesout my.cnf]

    test when-has-ndbd-role {} -constraints X -setup $SETUP -body {
      set ndbdInMycnfLines [dict get $::mycnf::mycnfDic {[ndbd]}]
      foreach line $ndbdInMycnfLines {
        if {[string first connect-string= $line] == 0} {
          return $line
        }
      }

    } -cleanup $CLEANUP -match exact -result {connect-string=nodeid=b,192.168.33.50:14500}

    # match regexp, glob, exact
    cleanupTests
}
namespace delete ::example::test
