import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		 ArrayList<Integer>intersection=new ArrayList<Integer>();
		 int i=0,j=0;
		 while(i<n && j<m){
			 if(arr1.get(i).equals(arr2.get(j))){
				 intersection.add(arr1.get(i));
				 i++;
				 j++;
			 } else if (arr1.get(i)<arr2.get(j)){
				 i++;
			 } else{
				 j++;
			 }
		 }
		 return intersection;
     }
}

Explanation
It uses ArrayLists instead of arrays. It initializes an empty ArrayList to store the intersection 
and uses two pointers to traverse through the ArrayLists.
If the elements are equal, it adds the element to the intersection ArrayList,
and increments both pointers. If the element in arr1 is smaller, 
it increments the index for arr1, else it increments the index for arr2. 
Finally, it returns the intersection ArrayList.
The time complexity of this algorithm is O(N+M),
 where N and M are the sizes of the ArrayLists.
