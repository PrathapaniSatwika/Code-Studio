import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
		k %= n; // handle cases where K > N
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - k) % n;
            rotatedArr[newIndex] = arr[i];
        }

        // Writing output
        for (int i = 0; i < n; i++) {
          System.out.print(rotatedArr[i] + " ");
    }
  }
}