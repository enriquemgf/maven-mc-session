package com.mastercard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void whenCallingSumResultShouldHaveTheRightResult() {
        Calculator c = new Calculator();
        c.sum(2, 2);
        Integer expectedResult = 4;
        assertEquals(expectedResult, c.getResult());
    }

    @Test(expected = NullPointerException.class)
    public void whenCallingSubWithNegativeScenarioShouldThrowRuntimeException() {
        Calculator c = new Calculator();
        c.sub(2, 4);
    }

    @Test()
    public void whenCallingSubWithPositiveScenarioResultShouldHaveTheRightResult() {
        Calculator c = new Calculator();
        c.sub(4, 2);
        Integer expectedResult = 2;
        assertEquals(expectedResult, c.getResult());
    }
}