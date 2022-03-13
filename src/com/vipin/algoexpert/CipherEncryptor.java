package com.vipin.algoexpert;

public class CipherEncryptor {

    public static void main(String [] args)
    {

        caesarCypherEncryptor("xyz", 53).equals("zab");
    }


    public static String caesarCypherEncryptor(String str, int key) {


        String alphabet="abcdefghijklmnopqrstuvwxyz";


        String resultString="";
        for(int i=0; i< str.length();i++)
        {


            int newKey=(alphabet.indexOf(str.charAt(i))+key)%26;


            resultString+=alphabet.charAt(newKey);


        }
        return resultString;
    }

}
