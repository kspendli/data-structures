package com.kspendli.datastructures.bits;

public class IterativePower {

    /*
    * x power n
    * */
    static int pow(int x, int n){
        int result = 1;
        while(n > 0){
            if((n&1)==1){
                result = result*x; // we consider only set values
            }
            n = n>>1;
            x= x*x;
        }

        return result;
    }

    public static void main(String[] args) {
        pow(3,5);
    }


}
