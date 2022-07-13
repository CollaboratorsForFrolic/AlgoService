package com.microalgo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRunLengthEncodingServicesTest {

    @Test
    void runLengthEncodingTest(){
        //assume
        String input = "aaabbcddddeeaabbb";
        String output = "a3b2cd4e2a2b3";
        //assemble
        StringRunLengthEncodingServices stringRunLengthEncodingServices = new StringRunLengthEncodingServices();
        //act
        String response = stringRunLengthEncodingServices.runLengthEncoding(input);
        //assert
        assertEquals(output,response);
    }

}