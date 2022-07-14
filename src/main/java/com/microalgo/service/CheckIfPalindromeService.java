package com.microalgo.service;

import io.micrometer.core.instrument.util.StringUtils;

public class CheckIfPalindromeService {

    public String checkIfPalindrome(String input){
        if(StringUtils.isEmpty(input)|| StringUtils.isBlank(input) ){
            return "Empty or null ,check not applicable";
        }
        int size = input.length();
        char[] charArray = input.toCharArray();
        for(int i =0; i< size/2 ; i++){

            if(charArray[i] != charArray[size-1-i]){
                return "Its not a palindrome";
            }
        }
        return "Its a palindrome";

    }
}
