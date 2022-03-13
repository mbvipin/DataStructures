package com.vipin.algoexpert;

public class ThreeLargestNumbers {

    public static void main (String [] args)
    {

        findThreeLargestNumbers(new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7});
    }

    private static int [] findThreeLargestNumbers(int[] array) {

        if(array.length <3)
        {
            return new int [0];
        }

        int [] resultArray=new int []{Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};

        for(Integer element: array)
        {
            if(element> resultArray[2])
            {
                swap(resultArray,1,0);
                swap(resultArray,2,1);
                resultArray[2]=element;

            }
            else if(element> resultArray[1])

            {
                swap(resultArray,1,0);
                resultArray[1]=element;

            }

            else if (element> resultArray[0])
            {
                resultArray[0]=element;
            }

        }



        return resultArray;
    }

    private static void swap(int [] array,int from, int to)
    {
        int temp=array[from];
        array[from]=array[to];
        array[to]=temp;
    }

    }

