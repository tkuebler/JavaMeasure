/*
 * Syslog.java
 *
 * Created on November 1, 2002, 9:34 PM
 */

package com.diddlebits.util;

import java.io.PrintStream;

/**
 *
 * @author  tkuebler
 */
public final class Syslog {
    
    public static final void out (String message, boolean debug) {
        if(debug) {System.out.println(new java.util.Date().toString() + " - " + message);}
    }
    
    public static final void out (String message, PrintStream ps, boolean debug) {
    // code to put this to a file... should probably just use log4j..
        /*
        try {
            logFile = new RandomAccessFile("logFile","rw");
            logFile.seek(logFile.length());
	} catch (IOException e) { 
            log("logfile error: " + e);
	}
         */
    }
    
}
