package com.kspendli.datastructures.bits;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        System.out.println(countDigits(1333456));
    }

    /*
    * log10 value and plus 1 will become digits in count
    * we need to do floor as well
    * */
    private static int countDigits(int N) {
        return (int) Math.floor(Math.log10(N)+1);
    }
}
