package com.kspendli.datastructures.queue;

public class CircularTour {

    public static int circularTour(int petrol[], int distance[]){
        int curPetrol=0;
        int prevPetrol=0;
        int start = 0;
        for (int i=0;i<petrol.length;i++){
            curPetrol+=petrol[i]-distance[i];
            if(curPetrol < 0){
                start=i+1;
                prevPetrol+=curPetrol;
                curPetrol=0;
            }
        }

        return curPetrol+prevPetrol > 0 ? start+1 : -1;
    }
    public static void main(String[] args) {
        System.out.println(circularTour(new int[]{4, 8}, new int[]{5,6}));
    }
}
