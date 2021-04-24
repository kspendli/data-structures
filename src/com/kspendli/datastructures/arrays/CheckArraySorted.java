package com.kspendli.datastructures.arrays;

public class CheckArraySorted {
    public static void main(String[] args) {
       // boolean result = checkArraySorted(new int[]{10,30,40,50});
        boolean result = checkArraySorted(new int[]{10,30,20, 40,50});

        System.out.println("Array Sorted: "+result);
    }

    //Check any element lesser than previous element
    private static boolean checkArraySorted(int[] a) {
        for (int i=1;i < a.length; i++){
            if(a[i] < a[i-1])
                return false;
        }
        return true;
    }
}
