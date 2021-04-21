package com.kspendli.datastructures.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumbers {

    /*
    * Now set of numbers is 5,6
    * */
    public static void printNNumbers(int n){
        Queue<String > queue = new ArrayDeque<>();
        queue.offer("5");
        queue.offer("6");

        for(int i=0;i<n;i++){
            String cur = queue.poll();
            System.out.println(cur);
            queue.offer(cur+"5");
            queue.offer(cur+"6");
        }
    }

    public static void main(String[] args) {
        printNNumbers(10);
    }
}
