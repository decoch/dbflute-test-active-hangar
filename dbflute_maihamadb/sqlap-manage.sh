#!/bin/bash

cd `dirname $0`
. _project.sh

export answer=y

export DBFLUTE_ENVIRONMENT_TYPE=sqlap

FIRST_ARG=$1
SECOND_ARG=$2

sh $DBFLUTE_HOME/etc/cmd/_df-manage.sh $MY_PROPERTIES_PATH $FIRST_ARG $SECOND_ARG
taskReturnCode=$?

unset DBFLUTE_ENVIRONMENT_TYPE

if [ $taskReturnCode -ne 0 ];then
  exit $taskReturnCode;
fi
