package com.kspendli.datastructures.arrays;

//IP: [2,0,2]
//OP: 2
/*
* IN: [5,0,6,2,3]
* Lmax: [5,5,6,6,6]
* Rmax: [6,6,6,3,3]
* ignore first and last
* op: 5+0+1 = 6
* */
public class TappingRainWater {
    public static void main(String[] args) {
        int result = tapRainWater(new int[]{5,0,6,2,3});
        System.out.println(result);
    }

    private static int tapRainWater(int[] a) {
        int n = a.length;
        int lMax[] = new int[n];
        int rMax[] = new int[n];
        lMax[0] = a[0]; // Fill First Value
        rMax[n-1] = a[n-1]; // Fill Last value

        //prepare Left Max value
        for (int i=1; i < n; i++){
            lMax[i] = Integer.max(lMax[i-1], a[i]); // Finding Max from Left
        }

        for(int i=n-2;i >=0; i--){
            rMax[i] = Integer.max(a[i],rMax[i+1]); // Finding max from Right
        }

        int result = 0;
        for(int i=1; i <n-1; i++){
            result += Integer.min(lMax[i], rMax[i]) - a[i]; //finding minimum of lMax, rMax and minus of a[i]
        }

        return result;
    }
}
