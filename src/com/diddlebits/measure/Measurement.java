/*
 * Measurement.java
 *
 * Created on October 3, 2003, 6:59 PM
 */

package com.diddlebits.util.measure;

import com.diddlebits.util.measure.standard.UnitOfMeasure;
import java.io.Serializable;

/**
 *
 * @author  tkuebler
 */
public class Measurement implements Serializable {
    
    private double value; // should make this more general
    private UnitOfMeasure unit;
    
    public Measurement(UnitOfMeasure unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    
    public double getValue() {
        return value;
    }
    
    public UnitOfMeasure getUnitOfMeasure() {
        return unit;
    }

    public String toString() {
        return value + " " + unit.toString();
    }
}
