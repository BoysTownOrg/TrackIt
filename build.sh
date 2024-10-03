#!/bin/bash

set -eu
shopt -s globstar

javac -cp "src:lib/*" ./src/**/*.java -d bin
for FILE in images.jar jcalendar-1.3.3.jar joda-time-1.6.2.jar looks-2.0.1.jar opencsv-2.2.jar timingframework-swing-3.0.jar; do
    (cd bin/ && jar xf ../lib/$FILE)
done
rm -r bin/META-INF/
jar cvfe TrackIt.jar edu.cmu.cs.eyetrack.gui.EyeTrack -C bin .
