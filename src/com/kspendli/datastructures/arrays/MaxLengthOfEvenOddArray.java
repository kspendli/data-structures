package com.kspendli.datastructures.arrays;

public class MaxLengthOfEvenOddArray {

    public static void main(String[] args) {
        int result = maxLength(new int[]{10,12,14,7,8});
        System.out.println(result);
    }

    //Technique is every element need to check with previous element
    //whether they are different if different increase the count and take max with result
    private static int maxLength(int[] a) {
        int result = 1;
        int current = 1;
        for (int i=1; i < a.length; i++){
            if((a[i]%2==0 && a[i-1]%2 != 0) ||
                    (a[i]%2!=0 && a[i-1]%2 == 0) ){
                current++;
                result = Integer.max(result, current);
            }else {
               current=1;
            }
        }
        return result;
    }
}
