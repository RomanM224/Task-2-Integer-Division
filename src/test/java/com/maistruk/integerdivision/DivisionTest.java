package com.maistruk.integerdivision;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.maistruk.integerdivision.Division;

public class DivisionTest {
    
    private Division division;

    @BeforeEach
    public void setUp() {
        division = new Division();
    }

    @Test
    public void givenDividendMoreDevisor_whenDivide_thanGetResult() {
        DivisionResult divisionResult = new DivisionResult();
        DivisionStep divisionstepOne = new DivisionStep();
        DivisionStep divisionStepTwo = new DivisionStep();
        divisionResult.setDividend(1234);
        divisionResult.setDivisor(4);
        divisionResult.setQuotient(308);
        divisionResult.setRemainder(2);
        divisionstepOne.setMinuend(12);
        divisionstepOne.setSubtrahend(12);
        divisionResult.divisionSteps.add(divisionstepOne);
        divisionStepTwo.setMinuend(34);
        divisionStepTwo.setSubtrahend(32);
        divisionResult.divisionSteps.add(divisionStepTwo);

        DivisionResult divisionResultActual = division.divide(1234, 4);

        assertEquals(divisionResult, divisionResultActual);
    }

    @Test
    public void givenDividendLessThenDivider_whenDivide_thenZeroResult() {
        DivisionResult divisionResult = new DivisionResult();
        DivisionStep divisionstep = new DivisionStep();
        divisionResult.setDividend(9);
        divisionResult.setDivisor(15);
        divisionResult.setQuotient(0);
        divisionResult.setRemainder(9);
        divisionstep.setMinuend(0);
        divisionstep.setSubtrahend(0);
        divisionResult.divisionSteps.add(divisionstep);

        DivisionResult divisionResultActual = division.divide(9, 15);

        assertEquals(divisionResult, divisionResultActual);

    }
}
