/*
 * KPH.java
 *
 * Created on October 4, 2003, 12:30 AM
 */

package com.diddlebits.measure.standard.metric;


import com.diddlebits.measure.standard.*;
import com.diddlebits.measure.quantity.*;
import com.diddlebits.measure.standard.english.*;

/**
 *
 * @author  tkuebler
 */
public class MetersPerSecond implements UnitOfMeasure {
    
    private static final String NAME = "m/s";
    private static final String DESCRIPTION = "N/A";
    private static final Quantity QUANTITY = new Speed();
    private static final String SYMBOL = "n/a";
    private static final String ABBREV = "ft/s";
    private static final double SICONSTANT = 1;
    private static final UnitOfMeasure SIEQUIV = new FeetPerSecond();
    private static final StandardOfMeasure STANDARD = new Metric();
    
    public String getDescription() {
        return DESCRIPTION;
    }
    
    public String getName() {
        return NAME;
    }
        
    public String getAbbrev() {
        return ABBREV;
    }
    
    public String getSymbol() {
        return SYMBOL;
    }
    
    public  Quantity getQuantity() {
        return QUANTITY;
    }
    
    public double getSIConstant() {
        return SICONSTANT;
    }
    
    public UnitOfMeasure getSIEquiv() {
        return SIEQUIV;
    }
    
    public StandardOfMeasure getStandardOfMeasure() {
        return STANDARD;
    }
    
    public String toString() {
        return NAME;
    }
    
}
