/*
 * Foot.java
 *
 * Created on October 3, 2003, 11:23 PM
 */

package com.diddlebits.measure.standard.english;

import com.diddlebits.measure.quantity.Length;
import com.diddlebits.measure.standard.English;
import com.diddlebits.measure.standard.UnitOfMeasure;
import com.diddlebits.measure.standard.StandardOfMeasure;
import com.diddlebits.measure.quantity.Quantity;
import com.diddlebits.measure.standard.metric.Meter;

/**
 *
 * @author  tkuebler
 */
public final class Foot implements UnitOfMeasure {
    
    private static final StandardOfMeasure STANDARD = new English();
    private static final Quantity QUANTITY = new Length();
    private static final String NAME = "foot";
    private static final String ABBREV = "ft";
    private static final String SYMBOL = "\'";
    private static final String DESCRIPTION = "n/a";
    private static final UnitOfMeasure SIEQUIV = new Meter();
    private static final double SICONSTANT = 0.3048;
    
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
