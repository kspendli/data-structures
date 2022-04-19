package com.kspendli.datastructures.arrays;
/*
* Given Sorted Array
* print the Element Frequency's
* */
public class FrequencyOfElementsInSortedArray {
    public static void main(String[] args) {
        printFreqInArray(new int[]{10,20,30,30,30,40,40});
    }

    //The Idea is Just move one by one elements print the count when two elements are different
    //Lastly print count for last element
    private static void printFreqInArray(int[] a) {
        int val = a[0], count=1;
        for (int i=1; i < a.length; i++){
            if(a[i] != val){
                System.out.println(val+" "+count);
                val = a[i];
                count = 1;
            }else{
                count++;
            }
        }
        System.out.println(val+" "+count);
    }
}
