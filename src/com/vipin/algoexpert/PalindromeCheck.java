package com.vipin.algoexpert;

import java.util.Map;

public class PalindromeCheck {

    public static void main(String [] args)
    {

        isPalindromeUsingPointers("abcdcba");
    }

    public static boolean isPalindrome(String str) {

        String reversedString="";
        for(int i=str.length()-1; i>=0;i--)
        {
            reversedString+=str.charAt(i);
        }
        return str.equals(reversedString);
    }

    public static boolean isPalindromeUsingPointers(String str) {

        boolean isPalindrome=true;

        for(int i=0,j=str.length()-1; i< str.length()/2 && j>=str.length()/2; i++,j--)
        {
            if(! (str.charAt(i)==str.charAt(j)))
            {
                isPalindrome=false;
            }
        }
        return isPalindrome;
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
