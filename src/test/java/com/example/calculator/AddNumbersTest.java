package com.example.calculator;

import org.testng.annotations.Test;

public class AddNumbersTest {

    @Test
    public void testAdd_TwoInputs() {
        AddNumbers.add(5, 5);
    }

    @Test
    public void testAdd_ThreeInputs() {
        AddNumbers.add(5, 5, 5);
    }

    @Test
    public void testAdd_FourInputs() {
        AddNumbers.add(5, 5, 5,5);
    }

    @Test
    public void testAdd_FiveInputs() {
        AddNumbers.add(5, 5, 5,5,5);
    }
}
