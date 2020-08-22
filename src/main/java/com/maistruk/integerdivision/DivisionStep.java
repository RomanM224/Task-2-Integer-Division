package com.maistruk.integerdivision;

public class DivisionStep {
    
    private int minuend = 0;
    private int subtrahend = 0;

    public int getMinuend() {
        return minuend;
    }

    public void setMinuend(int minuend) {
        this.minuend = minuend;
    }

    public int getSubtrahend() {
        return subtrahend;
    }

    public void setSubtrahend(int subtrahend) {
        this.subtrahend = subtrahend;
    }
    
    @Override
    public boolean equals(Object o) {
        DivisionStep divisionStep = (DivisionStep) o;
        if(minuend != divisionStep.minuend) {
            return false;
        }
        if(subtrahend != divisionStep.subtrahend) {
            return false;
        }
        return true;
    }
}
