package com.microalgo.service;

import java.util.ArrayList;

public class EqualsSumSolution {

    public int equalSum(ArrayList<Integer> token) {

        // Write your code here.
        int size = token.size();
        Integer temp1 = 0;
        Integer temp2 = 0;
        int index = 0;
        for(int i = 0 ; i<=size/2 ; i++){
            if(!token.get(i).equals(token.get(size-i-1))){
                temp1 = temp1+token.get(i);
            }else if(!temp1.equals(token.get(size-i-1))){
                temp2 = temp2+token.get(size-i-1);
           // }else if(!temp2.equals(token.get(i))){

            }else if(temp1.equals(temp2)){
                return i+1;
            }
        }
        return -1;

    }
}
