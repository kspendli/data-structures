package com.kspendli.datastructures.arrays;
/*
* Given Array
* Find the Second Largest Element
* */
public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int result = findSecondLargestElementInArray(new int[]{12,34, 87, 55,6,7,87});
        System.out.println(result);
    }
    //if no second Largest return -1
    private static int findSecondLargestElementInArray(int[] a) {
        int sL=-1, fL=0;
        for (int i=1; i < a.length; i++){
            if(a[i] > a[fL]){ // Normally this condition is enough
                sL = fL;
                fL = i;
            }else if(a[i] != a[fL] && (sL==-1 || a[i] > a[sL])){ // Checking largest value and current value not same and larger than previous second Largest number
                sL=i;
            }
        }
        return a[sL];
    }
}
