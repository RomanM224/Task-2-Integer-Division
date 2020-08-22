package com.maistruk.integerdivision;

import static com.maistruk.integerdivision.NumberUtils.*;

public class Division {

    public DivisionResult divide(int dividend, int divisor) {
        if(divisor == 0) {
            throw new IllegalArgumentException("Division by zero!");
        }
        DivisionResult divisionResult = new DivisionResult();
        divisionResult.setDividend(dividend);
        divisionResult.setDivisor(divisor);
        if(dividend < divisor) {
            DivisionStep divisionStep = new DivisionStep();
            divisionResult.divisionSteps.add(divisionStep);
            divisionResult.setRemainder(dividend);
            return divisionResult;
        }
        int result = 0;
        int temporaryDividend = 0;
        int[] dividendDigits = splitToDigits(dividend);
        for (int i = 0; i < dividendDigits.length; i++) {
            if (temporaryDividend < divisor) {
                temporaryDividend = temporaryDividend * 10 + dividendDigits[i];
                result = result * 10;
            }
            if (temporaryDividend >= divisor) {
                DivisionStep divisionProcess = new DivisionStep();
                divisionProcess.setMinuend(temporaryDividend);
                divisionProcess.setSubtrahend(temporaryDividend / divisor * divisor);
                divisionResult.divisionSteps.add(divisionProcess);
                result = result + (temporaryDividend / divisor);
                temporaryDividend = temporaryDividend - (temporaryDividend / divisor * divisor);
            }
        }
        divisionResult.setRemainder(temporaryDividend);
        divisionResult.setQuotient(result);

        return divisionResult;
    }
}
