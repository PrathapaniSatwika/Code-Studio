import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<Integer> quickSort(List<Integer> arr){
        // Write your code here.
        if(arr.size()<=1){
            return arr;
        }
        int pivot=arr.get(arr.size()-1);
        List<Integer> smaller=new ArrayList<>();
        List<Integer> greater=new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            int num=arr.get(i);
            if(num<=pivot){
                smaller.add(num);
            } else{
                greater.add(num);
            }
        }
        List<Integer> sorted=new ArrayList<>();
        sorted.addAll(quickSort(smaller));
        sorted.add(pivot);
        sorted.addAll(quickSort(greater));
        return sorted;
    }
}