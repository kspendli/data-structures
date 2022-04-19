package com.kspendli.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* Given an array of integers numbers and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*
* */
public class TwoSumExample {
    /*
    * The Main logic is we can check target - current value is already present or check
    * O(n)
    * */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> values = new HashMap<>();
        for(int i=0; i< nums.length;i++){
            int delta = target-nums[i];
            if(values.containsKey(delta)){
                return new int[]{values.get(delta),i};
            }
            values.put(nums[i],i);
        }
        throw new IllegalArgumentException("not found");
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }
}
