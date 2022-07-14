package com.microalgo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingStringServicesTest {

    private SortingStringServices sortingStringServices = new SortingStringServices();


    //vanilla case
    @Test
    void sortStringAlphabeticallyVanillaTest(){
        //assemble

        //assume
        String[] inputArray = new String[] {"a","c","a","a","e"};
        String[] expectedResponse = new String[] {"a","a","a","c","e"};
        //act
        String[] actualResponse = sortingStringServices.sortStringAlphabetically(inputArray);
        //assert
        assertArrayEquals(expectedResponse, actualResponse);
    }

    //twisted case
    @Test
    void sortStringAlphabeticallyComplexTest(){
        //assemble

        //assume
        String[] inputArray = new String[] {"a","e","a","a","c"};
        String[] expectedResponse = new String[] {"a","a","a","c","e"};
        //act
        String[] actualResponse = sortingStringServices.sortStringAlphabetically(inputArray);
        //assert
        assertArrayEquals(expectedResponse, actualResponse);
    }


    //twisted case which actually tests the sorting
    @Test
    void sortStringAlphabeticallyTwistedTest(){
        //assemble

        //assume
        String[] inputArray = new String[] {"z","z","f","a","e","a","d","a","c"};
        String[] expectedResponse = new String[] {"a","a","a","c","d","e","f","z","z"};
        //act
        String[] actualResponse = sortingStringServices.sortStringAlphabetically(inputArray);
        //assert
        assertArrayEquals(expectedResponse, actualResponse);
    }

    //trying empty array
    @Test
    void sortStringAlphabeticallyEmptyTest(){
        //assemble

        //assume
        String[] inputArray = new String[] {};
        String[] expectedResponse = new String[]{"Un-neccessary operation"};
        //act
        String[] actualResponse = sortingStringServices.sortStringAlphabetically(inputArray);
        //assert
        assertArrayEquals(expectedResponse, actualResponse);
    }

}