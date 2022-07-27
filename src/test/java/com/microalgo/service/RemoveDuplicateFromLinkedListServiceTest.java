package com.microalgo.service;

import org.junit.jupiter.api.Test;


import java.util.LinkedList;



class RemoveDuplicateFromLinkedListServiceTest {

    RemoveDuplicateFromLinkedListService removeDuplicateFromLinkedListService = new RemoveDuplicateFromLinkedListService();

    @Test
    void removeDuplicatesTest(){
        //assemble
        LinkedList<Integer> input =new LinkedList<>();
        input.add(12);
        input.add(23);
        input.add(12);
        input.add(45);
        input.add(12);
        input.add(12);
        input.add(12);
        input.add(12);
        input.add(87);
        input.add(12);
        input.add(12);
        input.add(64);
        input.add(12);


        //assume
        //act
        removeDuplicateFromLinkedListService.removeDupicates(input);
        //assert
    }

}