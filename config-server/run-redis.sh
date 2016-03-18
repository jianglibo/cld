#!/bin/bash

function start {
    echo "starting"
    nohup src/redis-server redis.conf > nohub.out &
	echo $! > $1
}

function stop {
    echo "stoping"
	cat $1 | xargs kill -s 9
}

function restart {
    stop $1
    start $1
}

# $1 command
# $2 pidFile

if [ $1 == "start" ]
then
    start $2
elif [ $1 == "stop" ]
then
    stop $2
elif [ $1 == "restart" ]
then
    restart $2
else
    echo "do nothing"
fi
