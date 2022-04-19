package com.kspendli.datastructures.arrays;

public class MaxSumOfKConsecutiveElements {

    public static void main(String[] args) {
       int result =  maximumSumOfKConsecutiveElements(new int[]{1,8,30,-5,20,7}, 3);
        System.out.println(result);
    }

    /*
    * 1. Sum of K elements means first window
    * 2. subtract previous element and addition of K position element will get current window
    * 3. update if current max is bigger
    * */
    private static int maximumSumOfKConsecutiveElements(int[] a, int k) {
        //First window
        int currentWindow = 0;
        for (int i=0; i < k; i++){
            currentWindow+=a[i];
        }

        int maxWindow = currentWindow;
        for (int i=k;i<a.length;i++){
            currentWindow = currentWindow+(a[i]-a[i-1]);
            maxWindow = Integer.max(maxWindow, currentWindow);
        }
        return maxWindow;
    }
}
