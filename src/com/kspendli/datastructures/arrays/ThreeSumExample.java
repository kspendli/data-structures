package com.kspendli.datastructures.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
* Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
* such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
*
* Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
*
* */
public class ThreeSumExample {

    public static List<List<Integer>> threeSum(int[] nums) {
        //Sort Elements first
        Arrays.sort(nums);

        //The Results Must be in List of List
        List<List<Integer>> result = new LinkedList<>();
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || (i > 0 && nums[i] != nums[i-1]) ){
                int j=i+1;
                int k=nums.length-1;
                while(j < k){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while(j<k && nums[j]==nums[j+1])j++;
                        while(j<k && nums[k]==nums[k-1])k--;
                        j++;
                        k--;
                    }else if(nums[i] + nums[j]+nums[k] > 0 ){
                        k--;
                    }else{
                        j++;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        var results = threeSum(new int[]{-1,0,1,2,-1,-4});
        System.out.println(results);
    }
}
