package require tcltest 2.2
eval ::tcltest::configure $::argv

lappend auto_path [file join [file dirname [info script]] ..]

package require CommonUtil

namespace eval ::example::test {

    proc ::example::test::mmm {line matcher} {
      return [string match $matcher $line]
    }

    namespace import ::tcltest::*
    testConstraint X [expr {1}]

    variable lines [split {# management server host (default port is 1186)
[mysqld]
ndbcluster
ndb-connectstring=nodeid=50,192.168.33.50:14500
# provide connection string for management server host (default port: 1186)
[ndbd]
connect-string=nodeid=50,192.168.33.50:14500} \n]

    variable SETUP {
    }
    variable CLEANUP {#common cleanup code}

    test example-2 {} -constraints X -setup $SETUP -body {
      set segs [::CommonUtil::splitSeg $lines {\[*]}]
      set l [list]
      dict for {k v} $segs {
        lappend l $k
        lappend l [llength $v]
      }
      return $l
    # Second test; constrained
    } -cleanup $CLEANUP -match exact -result {{[mysqld]} 5 {[ndbd]} 2}

    # match regexp, glob, exact
    cleanupTests
}
namespace delete ::example::test
