package com.microalgo.service;

import io.micrometer.core.instrument.util.StringUtils;

public class StringRunLengthEncodingServices {
    public String runLengthEncoding(String input){

            if(StringUtils.isBlank(input) || StringUtils.isEmpty(input)){
                return "Un-necessary operation, String is empty or null";
            }
            int size = input.length();
            char[] charArray = input.toCharArray();
            char temp = charArray[0];
            int count = 1;
            StringBuilder output = new StringBuilder();
            for(int i = 1; i <size; i++){

                if(charArray[i] == temp){
                    count++;
                }else if (charArray[i] != temp){
                    encodeTheValues( count, output, temp);
                    count = 1;
                    temp = charArray[i];
                }

            }
            encodeTheValues( count, output, temp);
            System.out.println(output);
            return String.valueOf(output).replaceAll("\\s+", "");
    }

    private StringBuilder encodeTheValues(int count,StringBuilder output,char temp){

        if(count > 1) {
            output = output.append(temp).append(count);

        }else{
            output = output.append(temp);
        }
        return output;
    }

}
