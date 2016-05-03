tclsh flyway-4.0\run.tcl --pfolder=web-proxy --profile=local migrate

tclsh flyway-4.0\run.tcl --pfolder=web-proxy --profile=prod --host=192.168.33.50 migrate

add --user=webproxy change user for embeded file db.
