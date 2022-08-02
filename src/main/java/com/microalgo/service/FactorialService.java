package com.microalgo.service;

import java.util.ArrayList;
import java.util.List;

public class FactorialService {
    public List<Integer> memoizeCache = new ArrayList<>();

    public int getFactorial(int i){

        if( i == 1){
            return 1;
        }else{
            if(memoizeCache.size() >= i){
                return memoizeCache.get(i-1);
            }
            int fact = i * getFactorial(i-1);
            memoizeCache.add(fact);
            return fact;
        }
    }

    public List<Integer> getMemoizeCache(){
        return memoizeCache;
    }
}
