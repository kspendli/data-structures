package com.kspendli.datastructures.arrays;

public class MaximumSumOfCircularSubArray {
    public static void main(String[] args) {
        int result = maxSumOfCircularArray(new int[]{10,5,-5});
        System.out.println(result);
    }

    /*
    * 1. Find the normal max of sub array
    * 2. check the result is less than Zero or not
    * 3. Calculate the Sum of array
    * 4. find the max of inverted array(which is minimum of sub array)
    * 5. add array sum and max of inverted array results which is max circular
    * 6. return max of normal and circular
    * */
    private static int maxSumOfCircularArray(int[] a) {
        int normalMax = findMaxOfSubArray(a);
        if(normalMax < 0){
            return normalMax; // if All Negative Numbers it will be usefull
        }

        int arrSum = 0;
        for(int i=0; i < a.length; i++){
            arrSum += a[i];
            a[i] = -a[i]; // Inverting the array
        }

        int maxCircular = arrSum + findMaxOfSubArray(a);

        return Integer.max(maxCircular, normalMax);
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
