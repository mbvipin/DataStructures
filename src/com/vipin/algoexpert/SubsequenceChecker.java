package com.vipin.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceChecker {

    public static void main (String [] args)
    {
        List<Integer> array=new ArrayList<>();
        List<Integer> sequence=new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);

        sequence.add(2);
        sequence.add(3);

        isValidSubsequence(array,sequence);



    }


    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int matchedIndexInSequence=0;

        for(int num: array)
        {
            if( matchedIndexInSequence <=sequence.size())
            {
                if(num==sequence.get(matchedIndexInSequence))
                {
                    matchedIndexInSequence++;
                }
            }

            return matchedIndexInSequence==sequence.size();


        }



        return false;
    }

}
