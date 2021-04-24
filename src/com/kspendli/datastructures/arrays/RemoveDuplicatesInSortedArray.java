package com.kspendli.datastructures.arrays;

import java.util.Arrays;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int result[] = removeDuplicates(new int[]{10,20,30,40,40,50});
        System.out.println(Arrays.toString(result));
    }

    private static int[] removeDuplicates(int[] a) {
        int result = 1;
        for(int i=1; i < a.length;i++){
            if(a[i] != a[result-1]) {
                a[result] = a[i];
                result++;
            }
        }
        return Arrays.copyOf(a, result);// Extra Remaining Elements Not required
    }
}
