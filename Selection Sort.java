import java.util.* ;
import java.io.*; 
public class Solution {
	public static void selectionSort(int arr[], int n) {
		// Write your code here.
		for(int i=0;i<n;i++){
			int min=i;
			for(int j=i;j<=n-1;j++){
				if(arr[j]<arr[min])
				min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
}