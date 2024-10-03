#!/bin/bash

set -eu

javac -cp "src:lib/*" ./src/edu/cmu/cs/eyetrack/gui/EyeTrack.java
jar cvfm out.jar manifest.txt -C src . lib/*
