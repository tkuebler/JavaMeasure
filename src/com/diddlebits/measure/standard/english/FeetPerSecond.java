/*
 * Meter.java
 *
 * Created on October 3, 2003, 10:13 PM
 */

package com.diddlebits.measure.standard.english;

import com.diddlebits.measure.standard.*;
import com.diddlebits.measure.quantity.*;
import com.diddlebits.measure.standard.english.*;
import com.diddlebits.measure.standard.metric.*;

/**
 *
 * @author  tkuebler
 */
public class FeetPerSecond implements UnitOfMeasure {
    
    private static final StandardOfMeasure STANDARD = new English();
    private static final Quantity QUANTITY = new Speed();
    private static final String NAME = "ft/s";
    private static final String ABBREV = "ft/s";
    private static final String SYMBOL = "n/a";
    private static final String DESCRIPTION = "n/a";
    private static final UnitOfMeasure SIEQUIV = new MetersPerSecond();
    private static final double SICONSTANT = 3.28100;
    
    public String getDescription() {
        return DESCRIPTION;
    }
    
    public String getName() {
        return NAME;
    }
    
    public Quantity getQuantity() {
        return QUANTITY;
    }
    
    public double getSIConstant() {
        return SICONSTANT;
    }
    
    public StandardOfMeasure getStandardOfMeasure() {
        return STANDARD;
    }
    
    public String getAbbrev() {
        return ABBREV;
    }
    
    public String getSymbol() {
        return SYMBOL;
    }
    
    public UnitOfMeasure getSIEquiv() {
        return SIEQUIV;
    }
    
    public String toString() {
        return NAME;
    }
    
 // multiple constant to convert to SI equivalent
    
}
