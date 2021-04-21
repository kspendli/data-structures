package com.kspendli.datastructures.bits;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int N) {
        int fValue = 1;
        for (int i=1;i<=N;i++)
            fValue = fValue*i;
        return fValue;
    }
}
