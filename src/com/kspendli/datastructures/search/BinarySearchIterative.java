package com.kspendli.datastructures.search;

public class BinarySearchIterative {

    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};

        System.out.println( binarySearch(a,20));
    }

    private static int binarySearch(int[] a, int x) {

        int low = 0;
        int high = a.length-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(a[mid]==x)
                return mid;
            else if(a[mid] < x)
                low = mid+1;
            else
                high = mid-1;
        }

        return -1;
    }
}
