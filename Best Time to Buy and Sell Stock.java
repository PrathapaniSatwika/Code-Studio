import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.size();i++){
            int price=prices.get(i);
            if(price<minPrice){
                minPrice=price;
            } else if(price-minPrice>maxProfit){
               maxProfit= price-minPrice;
            }
        }
        return maxProfit;
    }
}