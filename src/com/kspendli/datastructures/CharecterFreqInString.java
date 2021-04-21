package com.kspendli.datastructures;

public class CharecterFreqInString {

    public static void main(String[] args) {
        String str = "kumaraswamy";

        printFrequency(str);
    }

    private static void printFrequency(String str) {

        int alphabets[] =new int[26];
        for (int i =0;i<str.length();i++){
            alphabets[str.charAt(i)-'a']++;
        }

        for (int i =0;i<alphabets.length;i++){
            if(alphabets[i] > 0){
                System.out.println((char)(i+'a')+" "+alphabets[i]);
            }
        }
    }
}
