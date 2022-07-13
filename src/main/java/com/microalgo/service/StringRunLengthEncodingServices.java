package com.microalgo.service;

public class StringRunLengthEncodingServices {
    public String runLengthEncoding(String input){
            int size = input.length();
            char[] charArray = input.toCharArray();
            char temp = charArray[0];
            int count = 1;
            String output = "";
            for(int i = 1; i <size; i++){

                if(charArray[i] == temp){
                    count++;
                }else if (charArray[i] != temp){
                    if(count > 1) {
                        output = output + temp + String.valueOf(count);

                    }else{
                        output = output + temp;
                    }
                    count = 1;
                    temp = charArray[i];
                }

            }

            if(count > 1) {
                output = output + temp + String.valueOf(count);

            }else{
                output = output + temp;
            }

            System.out.println(output);
            return output;
    }
}
