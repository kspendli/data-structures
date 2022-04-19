package com.kspendli.datastructures.arrays;
/*
*
* Need to find maximum sum of sub array
* */
public class MaximumSumOfSubArray {
    public static void main(String[] args) {
        int result = findMaxOfSubArray(new int[]{2,3,-8,7,-1,2,3});
        System.out.println(result);
    }

    private static int findMaxOfSubArray(int[] a) {
        //Technique is maxEnd(i)= max(maxEnd(i-1)+a[i], a[i])
        int result = a[0];
        int maxEnd = a[0];
        for(int i=1; i <a.length; i++){
            maxEnd = Integer.max(maxEnd+a[i], a[i]);
            result = Integer.max(result, maxEnd);
        }
        return result;
    }
}
