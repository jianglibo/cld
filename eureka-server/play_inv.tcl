#!/bin/sh
# play_inv.tcl \
exec tclsh "$0" ${1+"$@"}

#puts [exec ls]

# if not redirected, output of command will return.
set cnt [exec ls]

puts [llength $cnt]

#set er [exec mkdir /opt]

#catch as a command, expect one argument.

#ignore error
catch {exec mkdir /opt}

#if {[catch {exec mkdir /opt} msg options]} {
#  puts $msg
#  puts [dict get $options -code]
#}

#puts [llength $er]

puts hello

if {! 0} {
 puts "0 is falsy."
}

if 1 {
  puts "1 is true."
}

if {! "0"} {
  puts "\"0\" is falsy."
}

set fl [open "| ls this_file_does_not_exist"]
set data [read $fl]
if {[catch {close $fl} err]} {
    puts "ls command failed: $err"
}

set jdkfile jdk-8u73-linux-x64.tar.gz
set fhost http://www.fh.gov.cn/

#set chan [open "| curl -O $fhost$jdkfile"]

#proc GetData {chan} {
#    if {![eof $chan]} {
#	puts [gets $chan]
#    } else {
#        set forever 1
#    }
#}

#fileevent $chan readable [list GetData $chan]

after 3000 set forever 0

vwait forever

#set out [read $dwn]

#puts $out

