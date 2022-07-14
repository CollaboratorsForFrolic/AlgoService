package com.microalgo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfPalindromeServiceTest {

    CheckIfPalindromeService checkIfPalindromeService = new CheckIfPalindromeService();

    //simple test positive for palindrome with characters
    @Test
    void checkIfPalindromePlainTest(){
        //assemble
        String input = "offo";
        String expectedResponse = "Its a palindrome";
        //assume

        //act
        String actualResponse = checkIfPalindromeService.checkIfPalindrome(input);
        //assert
        assertEquals(expectedResponse, actualResponse);
    }


    //empty test
    @Test
    void checkIfPalindromeEmptyTest(){
        //assemble

        String expectedResponse = "Empty or null ,check not applicable";
        //assume

        //act
        String actualResponse = checkIfPalindromeService.checkIfPalindrome("");
        //assert
        assertEquals(expectedResponse, actualResponse);
    }

    //null test
    @Test
    void checkIfPalindromeNullTest(){
        //assemble

        String expectedResponse = "Empty or null ,check not applicable";
        //assume

        //act
        String actualResponse = checkIfPalindromeService.checkIfPalindrome(null);
        //assert
        assertEquals(expectedResponse, actualResponse);
    }

    //simple test negeative for palindrome with characters
    @Test
    void checkIfPalindromeNegeativeTest(){
        //assemble
        String input = "rubbish";
        String expectedResponse = "Its not a palindrome";
        //assume

        //act
        String actualResponse = checkIfPalindromeService.checkIfPalindrome(input);
        //assert
        assertEquals(expectedResponse, actualResponse);
    }

    //simple test positive for palindrome with numbers
    @Test
    void checkIfNumericPalindromePositiveTest(){
        //assemble
        String input = "123474321";
        String expectedResponse = "Its a palindrome";
        //assume

        //act
        String actualResponse = checkIfPalindromeService.checkIfPalindrome(input);
        //assert
        assertEquals(expectedResponse, actualResponse);
    }

    //simple test positive for palindrome with numbers and spaces
    @Test
    void checkIfNumericPalindromePositiveWithSpacesTest(){
        //assemble
        String input = "1 23 474 32 1";
        String expectedResponse = "Its a palindrome";
        //assume

        //act
        String actualResponse = checkIfPalindromeService.checkIfPalindrome(input);
        //assert
        assertEquals(expectedResponse, actualResponse);
    }

    //simple test negeative for palindrome with numbers
    @Test
    void checkIfNumericPalindromeNegeativeTest(){
        //assemble
        String input = "126474821";
        String expectedResponse = "Its not a palindrome";
        //assume

        //act
        String actualResponse = checkIfPalindromeService.checkIfPalindrome(input);
        //assert
        assertEquals(expectedResponse, actualResponse);
    }


    //simple test negeative for palindrome with numbers and spaces
    @Test
    void checkIfNumericPalindromeNegeativeWithSpacesTest(){
        //assemble
        String input = "1264  74821";
        String expectedResponse = "Its not a palindrome";
        //assume

        //act
        String actualResponse = checkIfPalindromeService.checkIfPalindrome(input);
        //assert
        assertEquals(expectedResponse, actualResponse);
    }

}