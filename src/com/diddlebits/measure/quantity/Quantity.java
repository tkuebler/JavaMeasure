/*
 * BaseQuantity.java
 *
 * Created on October 3, 2003, 9:08 PM
 */

package com.diddlebits.util.measure.quantity;

import com.diddlebits.util.measure.standard.UnitOfMeasure;

/**
 *
 * @author  tkuebler
 */
public interface Quantity {

    String getName();   
    String getSISymbol();
    UnitOfMeasure getSIUnit();
    String getDescription();
    boolean isDerived();
    
}
