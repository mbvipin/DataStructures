package com.vipin.algoexpert;

import java.util.Arrays;

public class RunLengthEncoding {


    public static void main(String [] args)
    {
        String input= "AAAAAAAAAAAAABBCCCCDD";

        String encodedString=runLengthEncoding(input);

        System.out.println(encodedString);
    }






    public static String runLengthEncoding(String string) {

        int countOfRun=1;
        int resultArrayIndex=0;

        String encodingKey="";

        for(int i=1;i< string.length();i++)
        {
            if(string.charAt(i)==string.charAt(i-1) || countOfRun==9)
            {
                countOfRun++;
            }
            else
            {

                encodingKey=getEncodingKey(string, countOfRun, encodingKey,i-1);

                countOfRun=1;
            }

        }

        return getEncodingKey(string, countOfRun, encodingKey,string.length()-1);

    }

    private static String getEncodingKey(String string, int countOfRun, String encodingKey,int index) {

        if(countOfRun>9)
        {
            while(countOfRun >9) {
                encodingKey += String.valueOf(9);
                encodingKey += string.charAt(index);
                encodingKey += countOfRun % 9;
                encodingKey += string.charAt(index);

            }
        }
        else
        {
            encodingKey+=String.valueOf(countOfRun);
            encodingKey+=string.charAt(index);
        }
        return encodingKey;
    }
}
