package com.kspendli.datastructures.arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int result = maxConsecutiveOnes(new int[]{0,1,1,0,1,1,1});
        System.out.println(result);
    }

    private static int maxConsecutiveOnes(int[] a) {
        int count = 0;
        int result = 0;
        for (int i=0;i < a.length;i++){
            if(a[i] == 0){
                count = 0;
            }else {
                count++;
                result = Integer.max(result, count);
            }
        }
        return result;
    }
}
