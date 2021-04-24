package com.kspendli.datastructures.arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int result[] = moveAllZerosToEnd(new int[]{10,3,0,4,50,43,0});
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveAllZerosToEnd(int[] a) {
        int count =0;
        for (int i=0; i < a.length; i++){ // Check Not Empty values
            if(a[i] != 0){
                a[count] = a[i];
                count++;
            }else {
                a[count] = 0;
            }
        }
        return a;
    }
}
