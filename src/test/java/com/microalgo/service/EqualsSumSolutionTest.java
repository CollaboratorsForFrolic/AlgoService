package com.microalgo.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class EqualsSumSolutionTest {

    EqualsSumSolution equalSumSolution = new EqualsSumSolution();

    @Test
    void testSimpleCondition(){
        //assemble
        //List<Integer> input = Arrays.asList(1, 4, 9, 3, 2);
        List<Integer> input = Arrays.asList(1, -2, 5, -1);

        //assume
        //act
        int actualResponse = equalSumSolution.equalSum(new ArrayList<Integer> (input));
        //assert


    }

}