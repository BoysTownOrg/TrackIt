javac -cp "src;lib/*" (gci -r  src -File -Filter *.java).FullName -d bin
$deps = @("images.jar", "jcalendar-1.3.3.jar", "joda-time-1.6.2.jar", "looks-2.0.1.jar", "opencsv-2.2.jar", "timingframework-swing-3.0.jar")
pushd bin
foreach ($file in $deps) {
    jar xf ../lib/"$file"
}
popd
Remove-Item -Path bin/META-INF/ -Recurse -Force
jar cvfe TrackIt.jar edu.cmu.cs.eyetrack.gui.EyeTrack -C bin .
