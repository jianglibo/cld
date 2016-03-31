#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

lappend auto_path [file dirname [info script]]

package require ArgParser

ArgParser::parse ::argv
#puts $params
parray params
