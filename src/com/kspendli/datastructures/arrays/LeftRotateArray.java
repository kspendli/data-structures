package com.kspendli.datastructures.arrays;

import java.util.Arrays;

//Ip: [1,2,3,4,5]
//OP: [2,3,4,5,1]
public class LeftRotateArray {
    public static void main(String[] args) {
        int result[] = leftRotateArray(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(result));
    }

    //Take first Element as Temp and assign at in last index value temp
    private static int[] leftRotateArray(int[] a) {
        int temp = a[0];
        for (int i=1; i < a.length; i++){
            a[i-1] = a[i];
        }
        a[a.length-1] = temp;
        return a;
    }
}
