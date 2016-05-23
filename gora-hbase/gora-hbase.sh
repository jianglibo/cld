#!/bin/bash

function start {
    echo "starting"
    nohup java -jar -Dspring.profiles.active=$2 $1 > nohub.out &
	echo $! > $3
}

function stop {
    echo "stoping"
	cat $1 | xargs kill -s 9
}

function restart {
    stop $3
    start $1 $2 $3
}

# $1 command
# $2 jarFile
# $3 profile
# $4 pidFile

if [ $1 == "start" ]
then
    start $2 $3 $4
elif [ $1 == "stop" ]
then
    stop $4
elif [ $1 == "restart" ]
then
    restart $2 $3 $4
else
    echo "do nothing"
fi
