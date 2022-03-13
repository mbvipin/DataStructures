package com.vipin.algoexpert;

public class BinarySearch {






    public static int binarySearch(int[] array, int target) {

        return binarySearchHelperIteratively(array,target,0,array.length-1);



    }

    public static int binarySearchHelper(int [] array,int target,int startPoint,int endPoint)
    {



        int midPoint=(startPoint+endPoint)/2;

        for(int i=startPoint, j=endPoint; i <=midPoint && j>=midPoint; i++,j--)
        {
            if(target== array[midPoint])
            {
                return midPoint;
            }

            else if(target < array[midPoint])
            {
                return binarySearchHelper(array,target,startPoint,midPoint);
            }

            else if (target > array[midPoint])
            {
                return binarySearchHelper(array,target,midPoint,endPoint);
            }
        }


        return -1;


    }


    public static int binarySearchHelperIteratively(int [] array,int target,int startPoint,int endPoint)
    {


        while(startPoint<=endPoint)
        {
            int midPoint=(startPoint+endPoint)/2;

            if(target== array[midPoint])
            {
                return midPoint;
            }

            else if(target < array[midPoint])
            {

                startPoint=midPoint-1;
            }

            else
            {
                endPoint=midPoint+1;
            }



        }



        return -1;


    }
}
