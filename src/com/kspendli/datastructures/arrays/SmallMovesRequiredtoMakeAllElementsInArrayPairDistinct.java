package com.kspendli.datastructures.arrays;

import java.util.Arrays;

/*
* You are given an array A of N integers within the range [1..N]
In one move, you increase or deccreas the value of any element by 1.
After every move all numbers should remain within the range [1..N]
Your task is to find the smallest required number of moves to make all elements
in the array pairwise distinct (i.e. no value can appear in the array more than once).
[1,2,1] can be changed in 2 steps [1,2,2], [1,2,3]
[6,2,3,5,6,3] 4 steps [6,2,1,5,3]
* */
public class SmallMovesRequiredtoMakeAllElementsInArrayPairDistinct {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{6,2,3,5,6,3}));
    }

    private static int solution(int a[]){
        Arrays.sort(a);

        int result=0;
        int index=1;
        for(int val:a){
            int diff=val-index;

            if(diff < 0){
                result-=diff;
            } else if (diff > 0){
                result += diff;
            }
            index +=1;
        }
        return result;
    }
}
