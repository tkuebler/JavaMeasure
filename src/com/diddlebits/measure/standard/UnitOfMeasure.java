/*
 * UnitOfMeasure.java
 *
 * Created on October 3, 2003, 7:08 PM
 */

package com.diddlebits.util.measure.standard;

import com.diddlebits.util.measure.standard.StandardOfMeasure;
import com.diddlebits.util.measure.quantity.Quantity;
import java.io.Serializable;

/**
 *
 * @author  tkuebler
 */
public interface UnitOfMeasure extends Serializable {
        
    StandardOfMeasure getStandardOfMeasure();
    Quantity getQuantity();
    String getName();
    String getAbbrev();
    String getSymbol();
    String getDescription();
    UnitOfMeasure getSIEquiv();
    double getSIConstant();
    String toString();
}
