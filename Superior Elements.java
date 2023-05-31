import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer> superiorElements=new ArrayList<>();
        int maxRight=a[a.length-1];
        superiorElements.add(maxRight);
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>maxRight){
                superiorElements.add(a[i]);
                maxRight=a[i];
            }
        }
        return superiorElements;
    }
}