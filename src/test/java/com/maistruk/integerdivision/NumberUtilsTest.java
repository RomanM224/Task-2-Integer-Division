package com.maistruk.integerdivision;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import static com.maistruk.integerdivision.NumberUtils.*;

public class NumberUtilsTest {

    @Test
    public void givenNumber1234_whenCountDigits_thenOutputAmountOfDigits() {
        assertEquals(4, countDigits(1234));
    }

    @Test
    public void givenZero_whenCountDigits_thenOutputAmountOfDigits() {
        assertEquals(1, countDigits(0));
    }

    @Test
    public void givenNumber10_whenCountDigits_thenOutputAmountOfDigits() {
        assertEquals(2, countDigits(10));
    }

    @Test
    public void givenNumber450000_whenCountDigits_thenOutputAmountOfDigits() {
        assertEquals(6, countDigits(450000));
    }

    @Test
    public void givenZero_whenSplitToDigits_thenOutputArrayOfDigits() {
        int[] expected = new int[] { 0 };

        assertArrayEquals(expected, splitToDigits(0));
    }

    @Test
    public void givenNumber234000_whenSplitToDigits_thenOutputArrayOfDigits() {
        int[] expected = new int[] { 2, 3, 4, 0, 0, 0 };

        assertArrayEquals(expected, splitToDigits(234000));
    }

    @Test
    public void givenNumber99_whenSplitToDigits_thenOutputArrayOfDigits() {
        int[] expected = new int[] { 9, 9 };

        assertArrayEquals(expected, splitToDigits(99));
    }

    @Test
    public void givenNumber1234_whenSplitToDigits_thenOutputArrayOfDigits() {
        int[] expected = new int[] { 1, 2, 3, 4 };

        assertArrayEquals(expected, splitToDigits(1234));
    }
}
