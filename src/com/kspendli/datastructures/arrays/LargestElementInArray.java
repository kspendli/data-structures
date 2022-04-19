package com.kspendli.datastructures.arrays;
/*
* Given Array
* Find the Largest element
* */
public class LargestElementInArray {

    public static void main(String[] args) {
        int result = findLargestElement(new int[]{1,4,5,9,11,45,2});
        System.out.println("The Result Element is "+result);
    }

    //Finding Largest Element in Array
    //The Question may vary either index or Element
    private static int findLargestElement(int a[]){
        int rIndex = 0; // Let consider as first Index Element is largest
        for(int i=1; i < a.length; i++){ //Loop All elements from first index to end
            if(a[i] > a[rIndex])
                rIndex = i;
        }
        return a[rIndex];//Returning Element
    }
}
