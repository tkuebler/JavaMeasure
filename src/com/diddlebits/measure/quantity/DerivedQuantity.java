/*
 * DerivedQuantity.java
 *
 * Created on October 3, 2003, 9:15 PM
 */

package com.diddlebits.util.measure.quantity;

import com.diddlebits.util.measure.standard.UnitOfMeasure;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author  tkuebler
 */
public abstract class DerivedQuantity {
    
    public abstract String getQuantityEquationString();
    public abstract Set getQuantitiesForCalculation();
    
    public final boolean isDerived() {
        return true;
    }
    
}
