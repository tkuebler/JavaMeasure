/*
 * StandardOfMeasure.java
 *
 * Created on October 3, 2003, 7:05 PM
 */

package com.diddlebits.measure.standard;

import java.util.ArrayList;
import com.diddlebits.measure.standard.UnitOfMeasure;
import com.diddlebits.measure.ConversionException;
import java.io.Serializable;

/**
 *
 * @author  tkuebler
 */
public interface StandardOfMeasure extends Serializable {
    
    String getName();
    String getDescription();
    ArrayList Units();
    UnitOfMeasure getEquivalentUnit(UnitOfMeasure unit) throws ConversionException;
    
}
