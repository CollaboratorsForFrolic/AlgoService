package com.microalgo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialServiceTest {

    FactorialService factorialService = new FactorialService();

    @Test
    void getFactorialWhatATest(){
        //assemble
        //assume
        int input = 6;
        int expectedOutput = 720;
        //act
        int actualOutput = factorialService.getFactorial(input);
        //assert
        assertEquals(expectedOutput,actualOutput);
    }

}