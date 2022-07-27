package com.microalgo.service;


import java.util.LinkedList;


import java.util.Set;
import java.util.stream.Collectors;


public class RemoveDuplicateFromLinkedListService {

    public void removeDupicates(LinkedList<?> input){
        //using an alternate data structure
        Set removeDups = input.stream().collect(Collectors.toSet());
        removeDups.stream().forEach(System.out::println);




    }
}
