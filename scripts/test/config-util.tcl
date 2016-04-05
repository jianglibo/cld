package require tcltest 2.2
eval ::tcltest::configure $::argv

set bd [file join [file dirname [info script]] ..]
lappend auto_path $bd

package require CommonUtil

namespace eval ::example::test {

    namespace import ::tcltest::*
    testConstraint X [expr {1}]

    variable SETUP {
      set ::ymlDict [::CommonUtil::loadYaml [file join $bd test fixtures local-profile.yml]]
    }
    variable CLEANUP {#common cleanup code}

    test example-2 {} -constraints X -setup $SETUP -body {
    # Second test; constrained
    } -cleanup $CLEANUP -match exact -result {}

    # match regexp, glob, exact
    cleanupTests
}
namespace delete ::example::test
