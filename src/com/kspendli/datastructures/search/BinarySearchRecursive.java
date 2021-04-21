package com.kspendli.datastructures.search;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        System.out.println(binarySearchRecur(a,40,0,4));
    }

    private static int binarySearchRecur(int[] a, int x, int low, int high) {
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;

        if(a[mid]==x)
            return mid;
        else if(a[mid]>x)
            return binarySearchRecur(a,x,low, mid-1);
        else
            return binarySearchRecur(a,x,mid+1,high);
    }
}
