#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

proc changeDict {varName} {
  upvar 1 $varName dtl
  dict set dtl a 0
  puts [dict keys $dtl]
  return $dtl
}

set outDt [dict create]

set ndt [changeDict $outDt]

puts $ndt

puts [dict keys $ndt]

puts [dict keys $outDt]

proc setValue {v} {
  set xx $v
  puts $xx
  puts [info vars]
}

setValue 5

puts [info vars]
