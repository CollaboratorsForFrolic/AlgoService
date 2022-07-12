package com.microalgo.service;

import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.stereotype.Service;

import static com.microalgo.constants.AlgoServiceConstants.GeneralMessagesConstants.REVERSE_NOT_NECESSARY;

@Service
public class StringServices {

    public String reverseString(String inputString){


        if(StringUtils.isEmpty(inputString)|| StringUtils.isBlank(inputString) ){
            return REVERSE_NOT_NECESSARY;
        }
        int size = inputString.length();
        char[] charArray = inputString.toCharArray();
        for(int i =0; i< size/2 ; i++){
            char temp;
            if(charArray[i] == charArray[size-1-i]){
                continue;
            }
            temp = charArray[i];
            charArray[i] = charArray[size-1-i];
            charArray[size-1-i] = temp;
        }
        return String.valueOf(charArray);

    }
}
