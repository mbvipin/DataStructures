package com.vipin.algoexpert;

public class MonotonicArray {

    public static void main(String [] args)
    {

        int [] array = new int[] {1,2,0};

        System.out.println(isMonotonic(array));

    }


    public static boolean isMonotonic(int[] array) {

        if( array.length==1 || array.length==0)
        {
            return true;
        }
        boolean increasing=true;
        boolean decreasing=true;

        for(int i=0; i< array.length-1;i++)
        {

            if(array[i+1]-array[i] >0)
            {
                decreasing=false;
            }

            if(array[i+1]-array[i] <0)
            {
                increasing=false;
            }

        }
        return !(increasing&& decreasing);
    }
}
