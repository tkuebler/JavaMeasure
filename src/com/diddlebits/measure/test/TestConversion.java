/*
 * TestConversion.java
 *
 * Created on October 3, 2003, 11:46 PM
 */

package com.diddlebits.measure.test;

import com.diddlebits.measure.*;
import com.diddlebits.measure.standard.*;
import com.diddlebits.measure.standard.metric.*; 
import com.diddlebits.measure.standard.english.*;

import com.diddlebits.util.Syslog;
/**
 *
 * @author  tkuebler
 */
public class TestConversion {
    
    /** Creates a new instance of TestConversion */
    public TestConversion() {
    }
    
    private static void runStandardEquivTest(Measurement mes, StandardOfMeasure som) {
        Syslog.out("Start Test:", true);
        try {
            Measurement blah = MeasurementConversion.Convert(mes,som);
        } catch ( ConversionException ce ) {
            Syslog.out("Test failed\n",true);
        }
        Syslog.out("Test Passed\n",true);
    }
    
    private static void runUnitOfMeasureTest(Measurement mes, UnitOfMeasure uom) {
        Syslog.out("Start Test:", true);
        try {
            Measurement blah = MeasurementConversion.Convert(mes,uom);
        } catch ( ConversionException ce ) {
            Syslog.out("Test failed",true);
        }
        Syslog.out("Test Passed\n",true);
    }
    
        
    public static void main(String s[]) {
        // one day I'll use this
        TestConversion test = new TestConversion();
        
        // english to metric equivalent
        /**/
        runStandardEquivTest(new Measurement(new Inch(), (double)6), new Metric());
        runStandardEquivTest(new Measurement(new Foot(), (double)6), new Metric());
        runStandardEquivTest(new Measurement(new Mile(), (double)6), new Metric());
        /**/
        
        // metric to english equivalent
        /**/
        runStandardEquivTest(new Measurement(new CentiMeter(), (double)6), new English());
        runStandardEquivTest(new Measurement(new Meter(), (double)6), new English());
        runStandardEquivTest(new Measurement(new KiloMeter(), (double)6), new English());
        /**/
        
        // metric to metric conversion
        /**/
        runUnitOfMeasureTest(new Measurement(new KiloMeter(), (double) 2), new KiloMeter());
        runUnitOfMeasureTest(new Measurement(new KiloMeter(), (double) 2), new Meter());
        runUnitOfMeasureTest(new Measurement(new KiloMeter(), (double) 2), new CentiMeter());
        runUnitOfMeasureTest(new Measurement(new Meter(), (double) 2), new KiloMeter());
        runUnitOfMeasureTest(new Measurement(new Meter(), (double) 2), new Meter());
        runUnitOfMeasureTest(new Measurement(new Meter(), (double) 2), new CentiMeter());
        runUnitOfMeasureTest(new Measurement(new CentiMeter(), (double) 2), new KiloMeter());
        runUnitOfMeasureTest(new Measurement(new CentiMeter(), (double) 2), new Meter());
        runUnitOfMeasureTest(new Measurement(new CentiMeter(), (double) 2), new CentiMeter());
        /**/
        
        // english to metric conversion
        /**/
        runUnitOfMeasureTest(new Measurement(new Mile(), (double) 2), new KiloMeter());
        runUnitOfMeasureTest(new Measurement(new Mile(), (double) 2), new Meter());
        runUnitOfMeasureTest(new Measurement(new Mile(), (double) 2), new CentiMeter());
        runUnitOfMeasureTest(new Measurement(new Foot(), (double) 2), new KiloMeter());
        runUnitOfMeasureTest(new Measurement(new Foot(), (double) 2), new Meter());
        runUnitOfMeasureTest(new Measurement(new Foot(), (double) 2), new CentiMeter());
        runUnitOfMeasureTest(new Measurement(new Inch(), (double) 2), new KiloMeter());
        runUnitOfMeasureTest(new Measurement(new Inch(), (double) 2), new Meter());
        runUnitOfMeasureTest(new Measurement(new Inch(), (double) 2), new CentiMeter());
        /**/
        
        // metric to english conversion
        runUnitOfMeasureTest(new Measurement(new KiloMeter(), (double) 2), new Mile());
        runUnitOfMeasureTest(new Measurement(new KiloMeter(), (double) 2), new Foot());
        runUnitOfMeasureTest(new Measurement(new KiloMeter(), (double) 2), new Inch());
        runUnitOfMeasureTest(new Measurement(new Meter(), (double) 2), new Mile());
        runUnitOfMeasureTest(new Measurement(new Meter(), (double) 2), new Foot());
        runUnitOfMeasureTest(new Measurement(new Meter(), (double) 2), new Inch());
        runUnitOfMeasureTest(new Measurement(new CentiMeter(), (double) 2), new Mile());
        runUnitOfMeasureTest(new Measurement(new CentiMeter(), (double) 2), new Foot());
        runUnitOfMeasureTest(new Measurement(new CentiMeter(), (double) 2), new Inch());
        
        // english to english conversion
        runUnitOfMeasureTest(new Measurement(new Mile(), (double) 2), new Mile());
        runUnitOfMeasureTest(new Measurement(new Mile(), (double) 2), new Foot());
        runUnitOfMeasureTest(new Measurement(new Mile(), (double) 2), new Inch());
        runUnitOfMeasureTest(new Measurement(new Foot(), (double) 2), new Mile());
        runUnitOfMeasureTest(new Measurement(new Foot(), (double) 2), new Foot());
        runUnitOfMeasureTest(new Measurement(new Foot(), (double) 2), new Inch());
        runUnitOfMeasureTest(new Measurement(new Inch(), (double) 2), new Mile());
        runUnitOfMeasureTest(new Measurement(new Inch(), (double) 2), new Foot());
        runUnitOfMeasureTest(new Measurement(new Inch(), (double) 2), new Inch());
    }
}