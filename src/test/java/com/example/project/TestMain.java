package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TestMain {

    @Test
    public void testBMI() {
        double bmiResult = Main.bmi(75.0,225.0);
        double expectedResult = (225.0/Math.pow(75,2))*703;
        assertEquals(expectedResult, bmiResult, "Expected: " + expectedResult + ". Received: " + bmiResult);
    }
    @Test
    public void testUnderweight() {
        String weightClassResult = Main.weightClass(75.0, 145.0);
        String expectedResult = "underweight";
        assertEquals(expectedResult, weightClassResult, "Expected: " + expectedResult + ". Received: " + weightClassResult);

    }
    @Test
    public void testNormal() {
        String weightClassResult = Main.weightClass(75.0, 165.0);
        String expectedResult = "normal";
        assertEquals(expectedResult, weightClassResult, "Expected: " + expectedResult + ". Received: " + weightClassResult);

    }
    @Test
    public void testOverweight() {
        String weightClassResult = Main.weightClass(75.0, 145.0);
        String expectedResult = "overweight";
        assertEquals(expectedResult, weightClassResult, "Expected: " + expectedResult + ". Received: " + weightClassResult);

    }
    @Test
    public void testObese() {
        String weightClassResult = Main.weightClass(75.0, 145.0);
        String expectedResult = "obese";
        assertEquals(expectedResult, weightClassResult, "Expected: " + expectedResult + ". Received: " + weightClassResult);

    }


}
