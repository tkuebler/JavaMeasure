/*
 * Meter.java
 *
 * Created on October 3, 2003, 10:13 PM
 */

package com.diddlebits.measure.standard.metric;

import com.diddlebits.measure.standard.UnitOfMeasure;
import com.diddlebits.measure.standard.StandardOfMeasure;
import com.diddlebits.measure.quantity.Quantity;
import com.diddlebits.measure.standard.Metric;
import com.diddlebits.measure.quantity.Length;

/**
 *
 * @author  tkuebler
 */
public class Meter implements UnitOfMeasure {
    
    private static final StandardOfMeasure STANDARD = new Metric();
    private static final Quantity QUANTITY = new Length();
    private static final String NAME = "meter";
    private static final String ABBREV = "m";
    private static final String SYMBOL = "n/a";
    private static final String DESCRIPTION = "n/a";
    private static final UnitOfMeasure SIEQUIV = new Meter();
    private static final double SICONSTANT = 1;
    
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
