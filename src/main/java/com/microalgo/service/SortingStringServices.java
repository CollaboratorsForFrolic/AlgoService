package com.microalgo.service;

import java.util.*;

public class SortingStringServices {
    public String[] sortStringAlphabetically(String[] inputArray){
        int size = inputArray.length;
        if(size==0){
            return new String[]{"Un-neccessary operation"};
        }
        Map<String,Integer> alphabetsDictionary = new HashMap<>(26);
        for(int i = 0 ; i<size ; i++){
            if(alphabetsDictionary.containsKey(inputArray[i])){
                alphabetsDictionary.replace(inputArray[i],(alphabetsDictionary.get(inputArray[i]))+1);
            }else{
                alphabetsDictionary.put(inputArray[i],1);
            }
        }
        List<String> sortedList = new ArrayList<>();
        for(String key : alphabetsDictionary.keySet()){
            Integer value = alphabetsDictionary.get(key);
            for(int i =0;i<value ;i++){
                sortedList.add(key);
            }
        }
        Object[] outputArray = sortedList.toArray();
        System.out.println(Arrays.toString(Arrays.copyOf(outputArray, outputArray.length, String[].class)));
        return Arrays.copyOf(outputArray, outputArray.length, String[].class);
    }

}
