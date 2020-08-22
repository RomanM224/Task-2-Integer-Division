package com.maistruk.integerdivision;

import java.util.ArrayList;
import java.util.List;

public class DivisionResult {
    
    private int dividend;
    private int divisor;
    private int quotient;
    private int remainder;
    List<DivisionStep> divisionSteps = new ArrayList<DivisionStep>();
    
    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getQuotient() {
        return quotient;
    }

    public void setQuotient(int quotient) {
        this.quotient = quotient;
    }
    
    @Override
    public boolean equals(Object o) { 
        DivisionResult divisionResult = (DivisionResult) o;
        if(dividend != divisionResult.dividend) {
            return false;
        }
        if(divisor != divisionResult.divisor) {
            return false;
        }
        if(quotient != divisionResult.quotient) {
            return false;
        }
        if(remainder != divisionResult.remainder) {
            return false;
        }
        if(!divisionSteps.equals(divisionResult.divisionSteps)) {
            return false;
        }
         return true;
    }

    @Override
    public String toString() {
        return "DivisionResult [dividend=" + dividend + ", divisor=" + divisor + ", quotient=" + quotient
                + ", remainder=" + remainder + ", divisionSteps=" + divisionSteps + "]";
    }
}
