package com.vipin.algoexpert;

public class ProductOfArrays {


    public static void main(String [] args)
    {
        int [] input = new int[] {9, 3, 2, 1, 9, 5, 3, 2};
        arrayOfProductsUsingLinearTime(input);

    }



    public static int[] arrayOfProducts(int[] array) {

        int [] resultArray=new int [array.length];

        for(int i=0; i< array.length; i++)
        {

            int product=1;
            for(int j=0; j<array.length; j++)
            {
                if(j!= i)
                {
                    product*=array[j];
                }


            }

            resultArray[i]=product;
        }

        return array;
    }


    public static int[] arrayOfProductsUsingLinearTime(int[] array) {


        int [] resultArray=new int [array.length];

        for(int k=0; k< array.length; k++)
        {

            int leftPointer=0;
            int rightPointer=array.length-1;
            int rightProduct=1;
            int leftProduct=1;

            while( leftPointer <k )
            {
                leftProduct*=array[leftPointer];
                leftPointer++;
            }

            while( rightPointer >k)
            {
                rightProduct*=array[rightPointer];
                rightPointer--;
            }

            resultArray[k]=leftProduct*rightProduct;

        }




        return resultArray;
    }
}
