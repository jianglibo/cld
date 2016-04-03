package require AppDetecter

set javaFolder /opt/java
set jdkFile jdk-8u73-linux-x64.tar.gz
set jdkFolder jdk1.8.0_73
set fileHost http://www.fh.gov.cn

if {! [file exists $javaFolder]} {
	exec mkdir -p $javaFolder
}

cd $javaFolder

if {! [file exists $javaFolder/$jdkFile]} {
  puts stdout "start downloading $fileHost/$jdkFile....\n"
	exec curl -O $fileHost/$jdkFile >&  curloutput.log
	puts stdout "download finished.\n"
}

if {! [file exists $javaFolder/$jdkFile]} {
	puts stdout "download $javaFolder/$jdkFile failed."
	exit 2
}

if {[file size $javaFolder/$jdkFile] < 10000} {
	puts stdout "download $javaFolder/$jdkFile failed.deleting partial file..."
	file delete $javaFolder/$jdkFile
	exit 2
}

exec tar -zxf $jdkFile

exec alternatives --install "/usr/bin/java" "java" "$javaFolder/$jdkFolder/bin/java" 1
exec alternatives --install "/usr/bin/javac" "javac" "$javaFolder/$jdkFolder/bin/javac" 1

puts stdout "checking java install..."

if { [catch {puts [exec java -version 2>@1]} msg] } {
	puts stdout "java install failed!"
	exit 2
}
