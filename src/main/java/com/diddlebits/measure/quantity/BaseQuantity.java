/*
 * BaseQuantity.java
 *
 * Created on October 3, 2003, 9:14 PM
 */

package com.diddlebits.measure.quantity;

/**
 *
 * BaseQuantiy                  SI Unit       Symbol
 *  length                      meter           m
 *  mass                        kilogram        kg
 *  time                        second          s
 *  electric current            ampere          A
 *  thermodynamic temperature   kelvin          K
 *  amount of substance         mole            mol
 *  luminous intensity          candela         cd
 *
 *
 * @author  tkuebler
 */

public abstract class BaseQuantity {
    
   
    public boolean isDerived() {
        return false;
    }

    
}
