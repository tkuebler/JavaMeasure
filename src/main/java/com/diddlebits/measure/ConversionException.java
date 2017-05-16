/*
 * ConversionException.java
 *
 * Created on October 3, 2003, 7:26 PM
 */

package com.diddlebits.measure;

/**
 *
 * @author  tkuebler
 */
public class ConversionException extends Exception {
    
    /** Creates a new instance of ConversionException */
    public ConversionException() {
        super("General Conversion Exception");
    }
    
    public ConversionException(String message) {
        super(message);
    }
   
}
