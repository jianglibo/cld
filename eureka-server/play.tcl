#!/bin/sh
# ftcl.tcl \
exec tclsh "$0" ${1+"$@"}

puts "This string comes out\
on a single line"

puts "\n................. examples of differences between  \" and {"

puts {$Z_LABEL $Z}

set Z Albany
set Z_LABEL "The Capitol of New York is: "

puts "$Z_LABEL {$Z}"

puts {$Z}

puts [expr 10 == 10]
set y [expr "10" == "10"]

#puts [expr "10 == 10 returns $y"]

#expr { ($a < $b) ? $a : $b}

cd ..

puts aaa

puts [catch {glob *}]

puts abc
