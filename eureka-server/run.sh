#!/bin/bash

cd /opt/eureka-server

function start {
    echo "starting"
    nohup java -jar -Dspring.profiles.active=$2 eureka-server-0.0.1-SNAPSHOT.jar &
	echo $! > application.pid
}

function stop {
    echo "stoping"
	cat application.pid | xargs kill -s 9
}

function restart {
    stop
    start
}

if [ $1 == "start" ]
then
    start
elif [ $1 == "stop" ]
then
    stop
elif [ $1 == "restart" ]
then
    restart
else
    echo "do nothing"
fi
