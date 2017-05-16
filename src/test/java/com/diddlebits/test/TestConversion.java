/*
 * TestConversion.java
 *
 * Created on October 3, 2003, 11:46 PM
 */

package com.diddlebits.test;

import com.diddlebits.measure.ConversionException;
import com.diddlebits.measure.Measurement;
import com.diddlebits.measure.MeasurementConversion;
import com.diddlebits.measure.standard.English;
import com.diddlebits.measure.standard.Metric;
import com.diddlebits.measure.standard.StandardOfMeasure;
import com.diddlebits.measure.standard.UnitOfMeasure;
import com.diddlebits.measure.standard.english.Foot;
import com.diddlebits.measure.standard.english.Inch;
import com.diddlebits.measure.standard.english.Mile;
import com.diddlebits.measure.standard.metric.CentiMeter;
import com.diddlebits.measure.standard.metric.KiloMeter;
import com.diddlebits.measure.standard.metric.Meter;
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