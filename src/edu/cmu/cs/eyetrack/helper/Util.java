package edu.cmu.cs.eyetrack.helper;

import java.io.File;

public abstract class Util {
	
	
	public static enum PanelID { START_MENU, GAME, BUFFER1, DISTRACTOR_LINEUP, BUFFER2 };

	public static String getTrackItVersion() {
		return "1.0.1-variable-trial-length";
	}
	
	// Debug settings, debug utilities
	public static boolean DEBUG = true;
	public static void dPrint(Object o) { dPrint(o.toString()); }
	public static void dPrint(String s) { if(DEBUG) System.out.print(s); }
	public static void dPrintln(Object o) { dPrintln(o.toString()); }
	public static void dPrintln(String s) { if(DEBUG) System.out.println(s); }
	
	// CMU-only experiments (temporary activation, not ready for production
	public static boolean CMU_ONLY = true;
	
	// Make a smiley face image show up during the buffer screen, or just keep a blank gray screen
	public static boolean SMILEY_FACE_BUFFER = false;
	
	
	// Adapted from Sun's JFileChooser demo
	public static String getExtension(File f) {
		String s = f.getName(), ext = null;
		
		int idx = s.lastIndexOf('.');
		if(idx > 0 && idx < s.length() - 1) {
			ext = s.substring(idx+1).toLowerCase();
		}
		return ext;
	}
	
	public static boolean isRunningOnMacOSX() {
		return System.getProperty("os.name").toLowerCase().startsWith("mac os x");
	}
}
