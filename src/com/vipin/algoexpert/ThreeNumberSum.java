package com.vipin.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static void main(String [] args)
    {

    }

    public static List<Integer []> threeSum(int [] array,int targetSum)
    {
        Arrays.sort(array);
        List<Integer[]> triplets=new ArrayList<Integer[]>();
        for(int i=0; i< array.length-2; i++)
        {
            int left=i+1;
            int right=array.length-1;

            while(left< right)
            {
                if((array[i]+array[left]+array[right])==targetSum)
                {
                    Integer [] triplet=new Integer [] {array[i],array[left],array[right]};

                    triplets.add(triplet);
                    left++;
                    right--;

                }

                if((array[i]+array[left]+array[right]) <targetSum)
                {
                    left++;
                }

                if((array[i]+array[left]+array[right]) >targetSum)
                {
                    right--;
                }

            }



        }

        return triplets;

    }
}
