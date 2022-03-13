package com.vipin.algoexpert;

public class BubbleSort {
    
    public static void main(String [] args) {

        int[] input = {8, 5, 2, 9, 5, 6, 3};
        
       bubbleSort(input);

    }

    private static int[] bubbleSort(int[] array) {

        for(int sortedIndex=array.length-1; sortedIndex>=0;sortedIndex--)
        {

            for(int j=1; j<array.length-1;j++)
            {
                if(array[j]> array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }

        return array;
    }
    }

