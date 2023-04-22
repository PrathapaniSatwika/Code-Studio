//only one test case is passed
import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Sort the array in non-decreasing order
         List<int[]> pairs = new ArrayList<>();
        // Sort the array
        Arrays.sort(arr);
        // Initialize left and right pointers
        int left = 0;
        int right = arr.length - 1;
        // Loop until left and right pointers meet
        while (left < right) {
            // If the sum of elements at left and right pointers is equal to S, add it to pairs
            if (arr[left] + arr[right] == s) {
                pairs.add(new int[] { arr[left], arr[right] });
                left++;
                right--;
            }
            // If the sum is less than S, move left pointer to right
            else if (arr[left] + arr[right] < s) {
                left++;
            }
            // If the sum is greater than S, move right pointer to left
            else {
                right--;
            }
        }
        // Sort the pairs in non-decreasing order of their first value and second value
        pairs.sort((a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]): Integer.compare(a[1], b[1]));
    // Return the list of pairs
    return pairs;
    }
}