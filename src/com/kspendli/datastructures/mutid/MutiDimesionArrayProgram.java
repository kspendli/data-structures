package com.kspendli.datastructures.mutid;

public class MutiDimesionArrayProgram {

    public static void main(String[] args) {
        printMutiDimensionArrayValues();
        printDefaultElements();
        int a[][]={{243,23,4},{55,33,66},{23,44,56}};
        passingMultiDimensionArray(a);

        printLikeSnake(a);

    }

    private static void printLikeSnake(int[][] a) {
        System.out.println("");
        for (int i=0;i<a.length;i++){
            if(i%2==0){
                for(int j=0;j<a[i].length;j++){
                    System.out.println(a[i][j]);
                }
            }else{
                for(int j=a[i].length-1;j>=0;j--){
                    System.out.println(a[i][j]);
                }
            }
        }

    }

    private static void passingMultiDimensionArray(int[][] a) {
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
    }

    private static void printMutiDimensionArrayValues() {
        int a[][]={{1,2,3},{4,5,6}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
    }

    private static void printDefaultElements(){
        int m=2;
        int n=3;
        int a[][]=new int[2][3];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++)
                System.out.println(a[i][j]);
        }

    }
}
