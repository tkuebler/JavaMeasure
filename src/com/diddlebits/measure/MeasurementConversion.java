/*
 * MeasurmentConversion.java
 *
 * Created on October 3, 2003, 7:07 PM
 */

package com.diddlebits.util.measure;

import com.diddlebits.util.measure.standard.StandardOfMeasure;
import com.diddlebits.util.measure.standard.UnitOfMeasure;
import com.diddlebits.util.measure.standard.Metric; // here because it is the SI

import com.diddlebits.util.Syslog;

/**
 *
 * @author  tkuebler
 */
public class MeasurementConversion {
    
    private static final boolean dbug = false;
    /** Do the work
     *
     * should choose equivalent SI unit to convert to by default
     *
     */
    public static Measurement Convert(Measurement measure, StandardOfMeasure standard) throws ConversionException {
        Measurement newMeasure = null;
        UnitOfMeasure newUnit = standard.getEquivalentUnit(measure.getUnitOfMeasure());
        // get the measurement's standard and compare it to the new one
        if ( measure.getUnitOfMeasure().getStandardOfMeasure().getName().compareTo(standard.getName()) == 0 ) {
            // same standard of measure, no conversion needed
            Syslog.out("Converted: same standard of measure, no conversion needed",dbug);
            newMeasure = measure;
        } else if (newUnit.getStandardOfMeasure().getName().compareToIgnoreCase("metric") == 0 ) {
            // converting to metric
            //Syslog.out("MeasurementConverstion:Convert - Converting to SI",dbug);
            double newValue = measure.getValue() * measure.getUnitOfMeasure().getSIConstant();
            newMeasure = new Measurement(newUnit, newValue);
        } else if ( measure.getUnitOfMeasure().getStandardOfMeasure().getName().compareToIgnoreCase("metric") == 0 ) {
            // converting from metric
            //Syslog.out("MeasurementConverstion:Convert - Converting from SI",dbug);
            double newValue = measure.getValue() / newUnit.getSIConstant();
            newMeasure = new Measurement(newUnit, newValue);
        } else { // converting from non-metric to non-metric
            Syslog.out("Conversion Failed", dbug);
            throw new ConversionException("Error: converting from non metric to non metric unsupported at this time");
        }
        Syslog.out("Converted: " + measure.toString() + " -> " + newMeasure.toString(), dbug);
        return newMeasure;
    }
    
    
    public static Measurement Convert(Measurement measure, UnitOfMeasure uom) throws ConversionException {
        
        Measurement newMeasure = null;
        boolean sourceMetric = (measure.getUnitOfMeasure().getStandardOfMeasure().getName().compareToIgnoreCase("metric") == 0);
        boolean targetMetric = (uom.getStandardOfMeasure().getName().compareToIgnoreCase("metric") == 0);
        
        // case of both being equal to start with
        if ( measure.getUnitOfMeasure().getName().compareToIgnoreCase(uom.getName()) == 0 ) {
            Syslog.out("Converted: " + measure.toString() + " -> " + measure.toString(), dbug);
            return measure;
        }
        
        // both metric, just convert
        if ( sourceMetric && targetMetric ) {
            newMeasure = convertSI2SI(measure, uom);
            
            Syslog.out("Converted: " + measure.toString() + " -> " + newMeasure.toString(), dbug);
            return newMeasure;
        }
        
        // only target metric
        if ( targetMetric ) {
            newMeasure = Convert(measure, uom.getStandardOfMeasure());
            newMeasure = convertSI2SI(newMeasure, uom);
            
            Syslog.out("Converted: " + measure.toString() + " -> " + newMeasure.toString(), dbug);
            return newMeasure;
        }
        // only source metric
        if ( sourceMetric ) {
            newMeasure = convertSI2SI(measure, uom.getSIEquiv());
            newMeasure = Convert(newMeasure, uom.getStandardOfMeasure());
            
            Syslog.out("Converted: " + measure.toString() + " -> " + newMeasure.toString(), dbug);
            return newMeasure;
        }
        // convert rest to their SI Equivs, do the conversion in SI, then convert back
        newMeasure = Convert(measure, new Metric());
        newMeasure = convertSI2SI(newMeasure, uom.getSIEquiv());
        newMeasure = Convert(newMeasure, uom.getStandardOfMeasure());  
        
        Syslog.out("Converted: " + measure.toString() + " -> " + newMeasure.toString(), dbug);
        return newMeasure;
    }
    
    /** Metric only conversions */
    private static Measurement convertSI2SI(Measurement measure, UnitOfMeasure uom) {
        Measurement newMeasure = null;
        
        // first convert to SI standard for that Quantity
        newMeasure = new Measurement(measure.getUnitOfMeasure().getSIEquiv(), measure.getValue() * measure.getUnitOfMeasure().getSIConstant());
        // then to the target uom
        newMeasure = new Measurement(uom, newMeasure.getValue() / uom.getSIConstant());

        return newMeasure;
    }
}
