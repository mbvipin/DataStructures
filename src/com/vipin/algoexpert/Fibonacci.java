package com.vipin.algoexpert;

public class Fibonacci {

    public static void main(String[] args) {



        System.out.println(getNthFib(6));
    }

    public static int getNthFib(int n) {

        if(n==1)
        {
            return 0;
        }

        else if(n==2)
        {
            return 1;
        }
  else {
            return getNthFib(n - 2) + getNthFib(n - 1);
        }


    }



    }

