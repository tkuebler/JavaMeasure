/*
 * Foot.java
 *
 * Created on October 3, 2003, 11:23 PM
 */

package com.diddlebits.util.measure.standard.english;

import com.diddlebits.util.measure.quantity.Length;
import com.diddlebits.util.measure.standard.English;
import com.diddlebits.util.measure.standard.metric.CentiMeter;
import com.diddlebits.util.measure.standard.UnitOfMeasure;
import com.diddlebits.util.measure.standard.StandardOfMeasure;
import com.diddlebits.util.measure.quantity.Quantity;

/**
 *
 * @author  tkuebler
 */
public final class Inch implements UnitOfMeasure {
    
    private static final StandardOfMeasure STANDARD = new English();
    private static final Quantity QUANTITY = new Length();
    private static final String NAME = "inch";
    private static final String ABBREV = "in";
    private static final String SYMBOL = "\"";
    private static final String DESCRIPTION = "n/a";
    private static final UnitOfMeasure SIEQUIV = new CentiMeter();
    private static final double SICONSTANT = 2.54000;
    
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
        
    public Quantity getQuantity() {
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
    
 // multiple constant to convert to SI equivalent

    
}
