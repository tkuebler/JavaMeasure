/*
 * Metric.java
 *
 * Created on October 3, 2003, 10:54 PM
 */

package com.diddlebits.measure.standard;

import com.diddlebits.measure.standard.metric.*;
import com.diddlebits.measure.ConversionException;
import java.util.ArrayList;
import java.util.Iterator;


import com.diddlebits.util.Syslog;
/**
 *
 * @author  tkuebler
 */
public final class Metric implements StandardOfMeasure {
    
    private static final String NAME = "metric";
    private static final String DESCRIPTION = "N/A";  
    private ArrayList units = new ArrayList();

    private static final boolean dbug= false;
    
    public Metric() {
        // load up units under metric heading here
        units.add(new Meter());
        units.add(new CentiMeter());
        units.add(new KiloMeter());
        units.add(new MetersPerSecond());
    }
    
    public ArrayList Units() {
        return units;
    }
    
    public String getDescription() {
        return DESCRIPTION;
    }
    
    public String getName() {
        return NAME;
    }
    
    public UnitOfMeasure getEquivalentUnit(UnitOfMeasure unit) throws ConversionException {
        UnitOfMeasure uom = null;
        // look through units and check for same quantity
        Syslog.out("    Unit is " + unit.getName(), dbug);
        Iterator it = units.iterator();
        while ( it.hasNext() ) {
            uom = (UnitOfMeasure) it.next();
            if ( unit.getSIEquiv().getName().compareToIgnoreCase(uom.getName()) == 0 ) {
                Syslog.out("    Metric - Found match - " + unit.getSIEquiv().getName() + " = " + uom.getName(),dbug);
                return uom;
            }
            Syslog.out("    Metric - " + unit.getSIEquiv().getName() + " != " + uom.getSIEquiv().getName(),dbug);
        }
        throw new ConversionException("Error - problems finding equivalent metric units " + unit.getSIEquiv().getName());
    }
    
}
