package com.vipin.dsa;



public class Main {

    public static void main(String[] args) {

        int [] intArray= new int[7];

        intArray[0]=1;
        intArray[1]=-22;
        intArray[2]=2;
        intArray[3]=35;
        intArray[4]=45;
        intArray[5]=44;
        intArray[6]=33;

        int index=-1;
        for(int i=0; i< intArray.length;i++)

        {
            if(intArray[i]==44)
            {
                index=i;
                break;
            }
            System.out.println(intArray[i]);
        }

        System.out.println(index);


    }
}
