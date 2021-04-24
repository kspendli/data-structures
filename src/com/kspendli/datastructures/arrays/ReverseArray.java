package com.kspendli.datastructures.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] result = reverseArray(new int[]{10,20,30,40,50});
        System.out.println(Arrays.toString(result));
    }

    //The Main Idea is Just swap the First index value and last Index Value
    //increment first index and decrement last index
    private static int[] reverseArray(int[] a) {
        int fIndex = 0, lIndex = a.length-1;
        while(fIndex < lIndex){
            int temp = a[lIndex];
            a[lIndex] = a[fIndex];
            a[fIndex] = temp;
            fIndex++;
            lIndex--;
        }
        return a;
    }
}
