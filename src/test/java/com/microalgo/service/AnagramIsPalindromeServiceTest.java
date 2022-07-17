package com.microalgo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramIsPalindromeServiceTest {
    AnagramIsPalindromeService anagramIsPalindromeService = new AnagramIsPalindromeService();

    //positive plain scenario
    @Test
    void testIfAnagramIsPalindromOrNot(){
        //assume
        String input = "abab";
        String expectedResponse = "Anagram is a palindrome";

        //assemble
        //act
        String actualResponse = anagramIsPalindromeService.checkIfAnagramIsPalindrome(input);
        //assert
        assertEquals(expectedResponse,actualResponse);

    }

    @Test
    void ifAnagramIsPalindromOrNotOddCountTest(){
        //assume
        String input = "abcccab";
        String expectedResponse = "Anagram is a palindrome";

        //assemble
        //act
        String actualResponse = anagramIsPalindromeService.checkIfAnagramIsPalindrome(input);
        //assert
        assertEquals(expectedResponse,actualResponse);

    }

    @Test
    void ifAnagramIsPalindromOrNotNegeative(){
        //assume
        String input = "abccceab";
        String expectedResponse = "Anagram is not a palindrome";

        //assemble
        //act
        String actualResponse = anagramIsPalindromeService.checkIfAnagramIsPalindrome(input);
        //assert
        assertEquals(expectedResponse,actualResponse);

    }

}