/*
 * Speed.java
 *
 * Created on October 3, 2003, 9:49 PM
 */

package com.diddlebits.measure.quantity;

import com.diddlebits.measure.standard.UnitOfMeasure;
import com.diddlebits.measure.standard.metric.MetersPerSecond;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author  tkuebler
 */
public final class Speed extends DerivedQuantity implements Quantity {

    private static final String NAME = "speed";
    private static final String DESCRIPTION = "N/A";
    private static Set QUANTITIES = new HashSet();
    private static final UnitOfMeasure UNIT = new MetersPerSecond();
    
    public String getDescription() {
        return DESCRIPTION;
    }
    
    public String getName() {
        return NAME;
    }
    
    public Set getQuantitiesForCalculation() {
        return QUANTITIES;
    }
    
    public String getQuantityEquationString() {
        return "speed = distance traveled / time";
    }
    
    public String getSISymbol() {
        return "m/s";
    }
    
    public UnitOfMeasure getSIUnit() {
        return UNIT;
    }
    
}
