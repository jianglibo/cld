● webproxy.service - webproxy server
   Loaded: loaded (/etc/systemd/system/webproxy.service; enabled; vendor preset: disabled)
   Active: failed (Result: exit-code) since Fri 2016-04-29 13:30:42 UTC; 3s ago
  Process: 4518 ExecStart=/opt/webproxy/boot-run-systemd.tcl (code=exited, status=0/SUCCESS)
 Main PID: 4520 (code=exited, status=143)

143 is from jvm.

gradlew -Dhost=192.168.33.50 deploy

some mock hosts:

mirrorlist.centos.org
