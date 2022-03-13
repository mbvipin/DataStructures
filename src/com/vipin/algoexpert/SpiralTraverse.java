package com.vipin.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

    public static void main (String [] args)
    {
        int [][] input =
                new int[][] {
                        {1, 2, 3},
                        {12,13,4},
                        {11,14,5},
                        {10,15,6},
                        {9,8,7}
                };




        spiralTraverse(input);





    }

    public static List<Integer> spiralTraverse(int[][] array) {

        int startingRow=0;
        int endingRow=array.length-1;
        int startingColumn=0;
        int endingColumn=array[0].length-1;

        List<Integer> numbers=new ArrayList<Integer>();

        while(startingRow<= endingRow && startingColumn <=endingColumn)
        {

            for(int i=startingColumn; i<=endingColumn; i++)
            {

                numbers.add(array[startingRow][i]);

            }

            for(int i=startingRow+1; i<=endingRow; i++)
            {

                numbers.add(array[i][endingColumn]);

            }

            for(int i=endingColumn-1; i>=startingColumn; i--)
            {

                if(startingRow==endingRow) break;
                numbers.add(array[endingRow][i]);

            }

            for(int i=endingRow-1; i>=startingRow+1; i--)
            {

                if(startingColumn==endingColumn) break;
                numbers.add(array[i][startingColumn]);

            }

            startingRow++;
            endingRow--;
            startingColumn++;
            endingColumn--;

        }


        return numbers;
    }
}
