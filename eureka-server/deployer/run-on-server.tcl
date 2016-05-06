#!/bin/sh
# install-redis.tcl \
exec tclsh "$0" ${1+"$@"}

set ::baseDir [file dirname [info script]]

set ::rawParamDict [dict create]

foreach a $::argv {
  set pair [split $a =]
  if {[llength $pair] == 2} {
    dict set ::rawParamDict [string trimleft [lindex $pair 0] -] [lindex $pair 1]
  }
}

set runUser eureka
set runGroup eureka
set appName eureka
set runFolder /opt/$appName

set unitFile /etc/systemd/system/${appName}.service
set javaExec [exec which java]
set systemdExec [file join $runFolder boot-run-systemd.tcl]
set pidFile "${runFolder}/${appName}.pid"

if {! [file exists $runFolder]} {
  exec mkdir -p $runFolder
}


foreach jar [glob -directory [file join $::baseDir ..] -types f -- *.jar] {
  set tname [file join $runFolder [file tail $jar]]
  set oname "${tname}.origin"
  if {[file exists $tname]} {
    if {[file exists $oname]} {
      exec rm -f $oname
    }
    exec mv $tname $oname
  }
  puts $jar
  exec cp $jar $tname
}

if {[catch {exec grep -Ei "^${runUser}:" /etc/passwd} msg o]} {
  exec groupadd $runGroup
  exec useradd -r -g $runGroup -s /bin/false $runUser
}

exec chown -R "${runUser}:${runGroup}" $runFolder

set strMap "@runFolder@ $runFolder @jarFile@ $tname @profile@ [dict get $::rawParamDict profile ] @runUser@ $runUser @pidFile@ $pidFile"

if {[catch {open [file join $::baseDir boot-run-systemd.tcl]} fid o]} {
  puts stdout $fid
  exit 1
} else {
  set lines [list]
  while {[gets $fid line] >= 0} {
    lappend lines [string map $strMap $line]
  }
  close $fid

  if {[catch {open $systemdExec w} fid o]} {
    puts $fid
    exit 1
  } else {
    foreach line $lines {
      puts $fid $line
    }
    close $fid
  }
}

exec chown -R ${runUser}:${runGroup} $runFolder

exec chmod a+x $systemdExec
	# create unit file
  # Type=simple
  # Type = forking
set unitFd [open $unitFile w]
set content {
	[Unit]
	Description= %s server
	After=network.target
	[Service]
	ExecStart=%s
	Type=forking
	PIDFile=%s
	[Install]
	WantedBy=multi-user.target
}
foreach line [split [format $content $appName $systemdExec $pidFile] \n] {
  puts $unitFd [string trim $line]
}
close $unitFd
	#code line in catch may output content to stderr, that make tcl script looks like wrong, but actually not.
catch {
	exec systemctl daemon-reload
	exec systemctl enable ${appName}.service
  exec systemctl restart ${appName}
} msg

puts stdout $msg


#version 0.0.1
