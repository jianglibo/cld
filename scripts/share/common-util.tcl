package provide CommonUtil 1.0

namespace eval ::CommonUtil {

}

proc ::CommonUtil::getBasePath {} {
  puts [info script]
  file join [file dirname [info script]] ..
}
