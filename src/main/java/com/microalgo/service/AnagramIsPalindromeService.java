package com.microalgo.service;

import io.micrometer.core.instrument.util.StringUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AnagramIsPalindromeService {

    public String checkIfAnagramIsPalindrome(String input){
        if(StringUtils.isBlank(input) || StringUtils.isEmpty(input)){
            return "String is null or empty";
        }
        int size = input.length();
        Map<Character, Integer> dictionary = new HashMap<>();
        for(int i = 0; i< size ; i++){
            if(dictionary.containsKey(input.charAt(i))){
                dictionary.replace(input.charAt(i),(dictionary.get(input.charAt(i)))+1);
            }else{
                dictionary.put(input.charAt(i),1);
            }
        }
        Collection<Integer> values = dictionary.values();
         return values.stream().filter(e -> e % 2 !=0).count() <=1 ? "Anagram is a palindrome": "Anagram is not a palindrome";

    }
}
