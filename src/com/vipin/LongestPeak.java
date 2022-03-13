package com.vipin;

public class LongestPeak {

    public static void main(String [] args)
    {
        int [] input = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};

         longestPeak(input);

    }

    public static int longestPeak(int[] array) {

        int increasingTrend=0;
        int lengthOfPeak=0;

        for(int i=1; i<array.length; i++)
        {
            if(array[i] > array[i-1])
            {
                increasingTrend++;
                lengthOfPeak++;
            }
            else
            {
                increasingTrend=0;
                lengthOfPeak=0;
            }

            if(increasingTrend>=3)
            {
                if(array[i]<array[i-1])
                {
                    lengthOfPeak++;
                }

            }

        }


        return lengthOfPeak;
    }
}
