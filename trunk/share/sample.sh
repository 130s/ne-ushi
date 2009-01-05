#!/bin/sh

if [ "$UIMA_HOME" == "" ]
then
  echo UIMA_HOME environment variable is not set
  exit 1
fi

. "$UIMA_HOME/bin/setUimaClassPath.sh"
if [ "$JAVA_HOME" = "" ]
then
  UIMA_JAVA_CALL=java
else
  UIMA_JAVA_CALL="$JAVA_HOME/bin/java"
fi

COMMONS_LOGGING_CLASSPATH=/Users/isaosaito/Library/apache/commons-logging/commons-logging-1.1.1/commons-logging-1.1.1.jar
NEUSHI_CLASSPATH=./bin
SEN_CLASSPATH="$SEN_HOME/lib/sen.jar"

"$UIMA_JAVA_CALL" -cp "$NEUSHI_CLASSPATH":"$UIMA_CLASSPATH":"$SEN_CLASSPATH":"$COMMONS_LOGGING_CLASSPATH" "-Duima.home=$UIMA_HOME" SampleMorphAnalysisApp ./desc/morphologicSenAeDescriptor.xml
