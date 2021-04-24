package com.kspendli.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* if a Element appears equal or more than size/2 is called Majority Element
* */
public class MajorityElement {
    public static void main(String[] args) {
        int a[] = new int[]{8,2,4,8,8};
        //int result = majorityElement(a);
        //int result = majorityElementWithHashMap(a);
        int result = majorityElementSolution(a);
        System.out.println(result >= a.length/2);
    }

    private static int majorityElement(int[] a) {
        Arrays.sort(a); // Sort the Elements
        int result = 1;
        int count = 1;
        for(int i =1; i < a.length; i++){
            if(a[i] != a[i-1]){
                result = Integer.max(result, count); // Maintain two counter variables
                count = 1;
            }else {
                count++;
            }
        }
        return Integer.max(result,count); // Return Max of counter
    }

    //other Solution with HashMap it takes more space
    private static int majorityElementWithHashMap(int[] a){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < a.length; i++){
            map.merge(a[i], 1, (oldVal, newVal)-> oldVal+newVal);
        }
        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
    }



    //Other solution simple one and most preferable
    private static int majorityElementSolution(int[] a){
        int mjIndex = 0;
        int count = 1;
        for (int i=1; i < a.length; i++){
            if(a[i] == a[mjIndex]){
                count++;
            }else {
                count--;
            }

            if (count == 0){
                mjIndex = i;
                count = 1;
            }
        }

        //Majority Element count
        int val = a[mjIndex];
        int result = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] == val)
                result ++;
        }

        return result;
    }
}
