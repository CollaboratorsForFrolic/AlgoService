package com.microalgo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRunLengthEncodingServicesTest {

    StringRunLengthEncodingServices stringRunLengthEncodingServices = new StringRunLengthEncodingServices();


    //Trying a vanilla scenario
    @Test
    void runLengthEncodingVanillaTest(){
        //assume
        String input = "aaabbcddddeeaabbb";
        String output = "a3b2cd4e2a2b3";
        //assemble

        //act
        String response = stringRunLengthEncodingServices.runLengthEncoding(input);
        //assert
        assertEquals(output,response);
    }

    //trying an empty string
    @Test
    void runLengthEncodingEmptyTest(){
        //assume

        //assemble

        //act
        String response = stringRunLengthEncodingServices.runLengthEncoding("");
        //assert
        assertEquals("Un-necessary operation, String is empty or null",response);
    }


    //trying a null
    @Test
    void runLengthEncodingNullTest(){
        //assume

        //assemble

        //act
        String response = stringRunLengthEncodingServices.runLengthEncoding(null);
        //assert
        assertEquals("Un-necessary operation, String is empty or null",response);
    }

    //Trying a vanilla scenario with numbers
    @Test
    void runLengthEncodingWithNumericStringTest(){
        //assume
        String input = "111223333";
        String output = "132234";
        //assemble

        //act
        String response = stringRunLengthEncodingServices.runLengthEncoding(input);
        //assert
        assertEquals(output,response);
    }

    //Trying a scenario where the string containes spaces
    @Test
    void runLengthEncodingWithSpacesTest(){
        //assume
        String input = "aaabbc dddd eeaabbb";
        String output = "a3b2cd4e2a2b3";
        //assemble

        //act
        String response = stringRunLengthEncodingServices.runLengthEncoding(input);
        //assert
        assertEquals(output,response);
    }

}