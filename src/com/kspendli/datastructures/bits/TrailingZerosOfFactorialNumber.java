package com.kspendli.datastructures.bits;

import java.util.concurrent.ConcurrentHashMap;

public class TrailingZerosOfFactorialNumber {
    public static void main(String[] args) {
        System.out.println(trailZerosFactorial(100));
        new ConcurrentHashMap();
    }

    /*
    * Trailing Zeros (N/5) + (N/25) +(N/125) like this
    * */
    private static int trailZerosFactorial(int N) {
        int result = 0;
        for(int i=5;i<=N;i=i*5){
            result = result+(N/i);
        }
        return result;
    }
}
