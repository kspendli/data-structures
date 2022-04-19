package com.kspendli.datastructures.arrays;
//[1,5,3,8,12]
// Result is : 13
public class StockBuySell {
    public static void main(String[] args) {
       // int result = maxProfit(new int[]{1,5,3,8,12});
        int result = maxProfit(new int[]{2,4,1});
        System.out.println(result);
    }

    private static int maxProfit(int[] a) {
        int profit = 0;
        for (int i=1; i < a.length; i++){
            if(a[i] > a[i-1]){
                profit = profit + (a[i]-a[i-1]);
            }
        }
        return profit;
    }
    /*
    * other solution
    * **/
    private static int maxProfitInStocks(int[] a){
        int profit=0;
        int x=0;
        int minVal=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i] < minVal){
                minVal=a[i];
            }
            x=a[i]-minVal;
            if(profit < x){
                profit = x;
            }
        }
        return profit;
    }
}
