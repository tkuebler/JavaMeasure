/*
 * Length.java
 *
 * Created on October 3, 2003, 9:24 PM
 */

package com.diddlebits.measure.quantity;

import com.diddlebits.measure.standard.metric.Meter;

/**
 *
 * @author  tkuebler
 */
public final class Length extends BaseQuantity implements Quantity {

    private static final String NAME = "length";
    private static final String DESCRIPTION = "distance between two points";
    private static final String SISYMBOL = "m";
    private static final Meter SIUNIT = new Meter();
    
    public String getDescription() {
        return DESCRIPTION;
    }
    
    public String getName() {
        return NAME;
    }
    
    public String getSISymbol() {
        return SISYMBOL;
    }
    
    public com.diddlebits.measure.standard.UnitOfMeasure getSIUnit() {
        return SIUNIT;
    }
    
}
