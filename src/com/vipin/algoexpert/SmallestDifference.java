package com.vipin.algoexpert;

import java.util.Arrays;

public class SmallestDifference {

    public static void main(String [] args)
    {


        smallestDifference(
                new int[] {240, 124, 86, 111, 2, 84, 954, 27, 89}, new int[] {1, 3, 954, 19, 8});
    }



    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int smallestDifference= Integer.MAX_VALUE;
        int difference=Integer.MAX_VALUE;

        int [] resultArray=new int [2];

        int i=0;
        int j=0;

        while(i<arrayOne.length && j<arrayTwo.length)
        {
            int firstArrayNum=arrayOne[i];
            int secondArrayNum=arrayTwo[j];



            if(firstArrayNum<secondArrayNum)
            {
                difference=secondArrayNum-firstArrayNum;
                i+=1;
            }

            else    if(firstArrayNum>secondArrayNum)
            {
                difference=firstArrayNum-secondArrayNum;
                j+=1;
            }

            else
            {
                resultArray[0]=firstArrayNum;
                resultArray[1]=secondArrayNum;

                return resultArray;
            }
            if(difference <smallestDifference)
            {
                smallestDifference=difference;

                resultArray[0]=firstArrayNum;
                resultArray[1]=secondArrayNum;

            }



        }




        return resultArray;
    }
}
