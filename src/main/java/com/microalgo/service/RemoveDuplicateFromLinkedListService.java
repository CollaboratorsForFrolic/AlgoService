package com.microalgo.service;


import java.util.LinkedList;


import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;


public class RemoveDuplicateFromLinkedListService {

    public void removeDupicates(LinkedList<?> input){
        //using an alternate data structure
        //Set removeDups = input.stream().collect(Collectors.toSet());
        //removeDups.stream().forEach(System.out::println);

        ListIterator itr = input.listIterator();

        while(itr.hasNext()){
            itr.
            if(itr.previous()==null) {
                continue;
            }
            if(itr.next()==itr.previous()){
                itr.next();
                input.remove();
            }

        }










    }
}
