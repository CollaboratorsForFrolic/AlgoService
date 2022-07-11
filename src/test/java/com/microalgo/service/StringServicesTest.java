package com.microalgo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.microalgo.constants.AlgoServiceConstants.GeneralMessagesConstants.REVERSE_NOT_NECESSARY;

class StringServicesTest {


    private StringServices stringServices= new StringServices();


    //reversing a simple string
    @Test
    void reverseStringTest(){
        //assemble

        //assume
        String inputString = "Pratima Sharma";
        String expectedOutput = "amrahS amitarP";
        //act
        String actualResponse = stringServices.reverseString(inputString);
        //assert
        assertEquals(expectedOutput,actualResponse);

    }


    //reversing a complex string
    @Test
    void reverseComplexStringTest(){
        //assemble

        //assume
        String inputString = "Pratima Sharma is a rainbow singer";
        String expectedOutput = "regnis wobniar a si amrahS amitarP";
        //act
        String actualResponse = stringServices.reverseString(inputString);
        //assert
        assertEquals(expectedOutput,actualResponse);

    }

    //trying a string containing numbers
    @Test
    void reverseEmptyStringTest(){
        //assemble

        //assume
        String inputString = "1223234324324 23 24334345";
        String expectedOutput = "54343342 32 4234234323221";

        //act
        String actualResponse = stringServices.reverseString(inputString);
        //assert
        assertEquals(expectedOutput,actualResponse);

    }


    //trying an empty string
    @Test
    void reverseNumericStringTest(){
        //assemble

        //assume

        //act
        String actualResponse = stringServices.reverseString(" ");
        //assert
        assertEquals(REVERSE_NOT_NECESSARY,actualResponse);

    }



    //trying a null
    @Test
    void reverseNullStringTest(){
        //assemble

        //assume

        //act
        String actualResponse = stringServices.reverseString(null);
        //assert
        assertEquals(REVERSE_NOT_NECESSARY,actualResponse);

    }


    //trying a string which starts and ends in spaces
    @Test
    void reverseStringWithLeadingAndTrailingSpacesTest(){
        //assemble

        //assume
        String inputString = "   123   ";
        String expectedOutput = "   321   ";
        //act
        String actualResponse = stringServices.reverseString(inputString);
        //assert
        assertEquals(expectedOutput,actualResponse);

    }


    //trying a string which starts with spaces
    @Test
    void reverseStringWithLeadingSpacesTest(){
        //assemble

        //assume
        String inputString = "   123";
        String expectedOutput = "321   ";
        //act
        String actualResponse = stringServices.reverseString(inputString);
        //assert
        assertEquals(expectedOutput,actualResponse);

    }

    //trying a string which ends with spaces
    @Test
    void reverseStringWithTrailingSpacesTest(){
        //assemble

        //assume
        String inputString = "321   ";
        String expectedOutput= "   123";

        //act
        String actualResponse = stringServices.reverseString(inputString);
        //assert
        assertEquals(expectedOutput,actualResponse);

    }

}