package com.galaxy.constant;

/**
 * Save to number mapper
* <p>Title: RomanNumeral</p>  
* <p>Description: </p>  
* @author Cao
* @date 2019年8月22日
 */
public enum RomanNumeral {
    I(1), 
    V(5),
    X(10), 
    L(50), 
    C(100), 
    D(500), 
    M(1000);

    int itsValue;

    RomanNumeral(int theValue) {
        this.itsValue = theValue;
    }

    public int getValue() {
        return itsValue;
    }
};
