public class Solution {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
         int n = a.length;
        int[] result = new int[n];

        // Separate positive and negative integers
        int posIndex = 0;
        int negIndex = 1;

        for (int num : a) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
           
    }
}