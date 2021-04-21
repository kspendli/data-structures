package com.kspendli.datastructures.bits;

public class PalindromeNumberCheck {

    public static void main(String[] args) {
        System.out.println(palindromeCheck(121));
    }

    /*
    * take original number
    * check weather number is greater zero or not
    * every iteration get last digit
    * calculate the reverse value
    * divide the number with 10
    * finally check reverse and original numbers are same or not
    * */
    private static boolean palindromeCheck(int N) {
        int reverse = 0;
        int original = N;
        while (N > 0){
            int digit = N%10;
            reverse = (reverse*10)+digit;
            N = N/10;
        }

        return original==reverse;
    }
}
