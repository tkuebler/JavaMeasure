/*
 * Metric.java
 *
 * Created on October 3, 2003, 10:54 PM
 */

package com.diddlebits.measure.standard;

import com.diddlebits.measure.ConversionException;
import com.diddlebits.measure.standard.english.Foot;
import com.diddlebits.measure.standard.english.Inch;
import com.diddlebits.measure.standard.english.Mile;
import com.diddlebits.util.Syslog;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author  tkuebler
 */
public final class English implements StandardOfMeasure {
    
    private static final String NAME = "english";
    private static final String DESCRIPTION = "N/A";  
    private ArrayList units = new ArrayList();

    private static final boolean dbug = false;
    
    public English() {
        // filling units with all avaible units from subdirectories goes here
        units.add(new Inch());
        units.add(new Foot());
        units.add(new Mile());
        
        
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
        Syslog.out("    English:getEquivUnit - Target unit is " + unit.getName(),dbug);
        Iterator it = units.iterator();
        while ( it.hasNext() ) {
            uom = (UnitOfMeasure) it.next();
            if ( unit.getStandardOfMeasure().getName().compareToIgnoreCase(getName()) == 0 
                    && unit.getName().compareToIgnoreCase(uom.getName()) == 0 ) {
              return uom;  
            } else if ( uom.getSIEquiv().getName().compareToIgnoreCase(unit.getName()) == 0 ) {
                Syslog.out("    English - Found match - " + uom.getSIEquiv().getName() + " = " + unit.getName(),dbug);
                return uom;
            }
            Syslog.out("    English - " + unit.getName() + " != " + uom.getSIEquiv().getName(),dbug);
        }
        throw new ConversionException("Error - problems finding equivalent metric units " + uom.getQuantity().getSISymbol());
    }
    
}
