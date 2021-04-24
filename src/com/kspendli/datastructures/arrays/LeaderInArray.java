package com.kspendli.datastructures.arrays;

//A Element that has small elements on right side is called Leader Element
//In Sorted Array only last element is Leader
//in Decreasing order array all elements are leader
public class LeaderInArray {
    public static void main(String[] args) {
        printLeadersInArray(new int[]{10,34,12,24,25,22});
    }

    //The Idea is move from last to first print all leaders
    private static void printLeadersInArray(int[] a) {
        int cLeader = a[a.length-1];
        System.out.println(cLeader);
        for (int i=a.length-2; i >=0;i--){
            if(a[i] > cLeader){
                cLeader = a[i];
                System.out.println(cLeader);
            }
        }
    }
}
