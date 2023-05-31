import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
       int i=0,j=0;
       List<Integer> ans=new ArrayList<>();
       while(i<a.length && j<b.length){
         if(a[i]<b[j]){
           ans.add(a[i++]);
         }
         else if (a[i]>b[j]){
           ans.add(b[j++]);
         }
         else{
           ans.add(a[i++]);
           j++;
         }
       }
        while(i<a.length){
          ans.add(a[i++]);
        }
        while(j<b.length){
          ans.add(b[j++]);
        }
       Set<Integer> set = new HashSet<>(ans);
        ans.clear();
        ans.addAll(set);
        Collections.sort(ans);
        return ans;
    }
}
/*
Sure! Here's the Java code that implements the algorithm I described earlier:

java
Copy code
import java.util.*;

public class Solution {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();
        
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result.add(a[i++]);
            } else if (a[i] > b[j]) {
                result.add(b[j++]);
            } else { // a[i] == b[j]
                result.add(a[i++]);
                j++;
            }
        }
        
        while (i < a.length) {
            result.add(a[i++]);
        }
        
        while (j < b.length) {
            result.add(b[j++]);
        }
        
        Set<Integer> set = new HashSet<>(result);
        result.clear();
        result.addAll(set);
        Collections.sort(result);
        
        return result;
    }
}
/*
The sortedArray method takes two integer arrays a and b as input and returns 
a List of integers that represents the union of the two arrays.

We first initialize two pointers i and j to the first element of a and b, 
respectively, and an empty ArrayList called result. We then iterate through 
both arrays using the pointers, comparing elements, and appending the smaller 
element to the result list. If the elements are equal, we append one of them 
and increment both pointers. When we reach the end of one array, we add 
the remaining elements of the other array to the result list.

After we have merged the two arrays into the result list, we remove duplicates 
using a HashSet, convert the Set back to a List, and sort it 
using the Collections.sort method. Finally, we return the result list.

Note that the addAll method of List adds all the elements of the Set 
to the List in the order in which they appear in the Set. 
Since we are using a HashSet to remove duplicates, the order of the elements in 
the List may not be the same as in the original arrays. */