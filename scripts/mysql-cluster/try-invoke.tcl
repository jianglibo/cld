#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

set ::baseDir [file join [file dirname [info script]] ..]
lappend auto_path $::baseDir

package require mycnf

::mycnf::writeToDisk
