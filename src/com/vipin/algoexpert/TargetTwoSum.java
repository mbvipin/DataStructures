package com.vipin.algoexpert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TargetTwoSum {

    public static void main (String [] args)
    {
        int[] array=new int [] {3, 5, -4, 8, 6, 1, -1, 11};
        int targetSum=10;

        twoNumberSumUsingTwoLoops(array,25);


    }


    public static int[] twoNumberSum(int[] array, int targetSum) {




        Set<Integer> nums=new HashSet<>();



        for(int i = 0; i< array.length-1; i++)
        {

            int possibleMatch=targetSum-array[i];

            if(nums.contains(possibleMatch))
            {
                return new int []{array[i],possibleMatch};
            }

            else
            {
                nums.add(array[i]);
            }
        }



        return new int [0];
    }

    public static int[] twoNumberSumUsingSort(int[] array, int targetSum) {

        Arrays.sort(array);

        int left=0;
        int right=array.length-1;

        for (int i=0; i< array.length-1;i++) {
            int sum = array[left] + array[right];
            if (sum == targetSum) {
                return new int[]{array[left], array[right]};
            } else if (sum > targetSum) {
                right--;
            } else if (sum < targetSum) {
                left++;
            }

        }

        return new int [0];






    }


    public static int[] twoNumberSumUsingTwoLoops(int[] array, int targetSum) {

        for(int i=0; i<= array.length-1; i++)
        {
            for (int j=i+1; j<=array.length-1; j++)
            {
                if( array[i]+array[j]==targetSum)
                {
                    return new int[] {array[i],array[j]};
                }
            }
        }


 return new int [0];



    }







}
