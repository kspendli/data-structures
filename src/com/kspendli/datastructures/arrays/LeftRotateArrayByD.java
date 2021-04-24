package com.kspendli.datastructures.arrays;

import java.util.Arrays;
//IN: [1,2,3,4,5]
//OP: [3,4,5,1,2]
public class LeftRotateArrayByD {

    public static void main(String[] args) {
        int result[] = leftRotateBy(new int[]{1,2,3,4,5}, 2);//2 digits Rotate
        System.out.println(Arrays.toString(result));
    }

    private static int[] leftRotateBy(int[] a, int d) {
        reverse(a,0,d-1); // First Reverse 0 to given numbers
        reverse(a, d,a.length-1); // Second Reverse Remaining Elements
        reverse(a, 0, a.length-1); // Final Reverse Total Array
        return a;
    }
    private static void reverse(int a[], int low, int high){
        while(low < high){ //Swapping
            int temp = a[high];
            a[high] = a[low];
            a[low] = temp;
            low++;
            high--;
        }
    }
}
