package com.vipin.sort;

public class BubbleSort {

    public static void main(String [] args)
    {

        int [] intArray= new int[7];

        intArray[0]=1;
        intArray[1]=-22;
        intArray[2]=2;
        intArray[3]=35;
        intArray[4]=45;
        intArray[5]=44;
        intArray[6]=33;

        int lastUnsortedIndex=intArray.length-1;

        for(int i=0; i<intArray.length; i++) {

            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    swap(intArray, j, j + 1);
                }


        }
            lastUnsortedIndex--;


        }

        for (int i=0; i< intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int [] array,int from, int to)
    {
        if(from==to) {
            return;
        }
        int temp=array[from];
        array[from]=array[to];
        array[to]=temp;

    }
}
