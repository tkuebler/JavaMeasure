/*
 * StandardOfMeasure.java
 *
 * Created on October 3, 2003, 7:05 PM
 */

package com.diddlebits.measure.standard;

import com.diddlebits.measure.ConversionException;

import java.io.Serializable;
import java.util.ArrayList;

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
