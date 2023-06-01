import java.util.*;
public class Solution {
    public static int[] spiralMatrix(int [][]MATRIX) {
        // Write your code here.
         if (MATRIX == null || MATRIX.length == 0 || MATRIX[0].length == 0) {
            return new int[0];
        }

        int rows = MATRIX.length;
        int columns = MATRIX[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;

        int[] result = new int[rows * columns];
        int index = 0;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                result[index++] = MATRIX[top][i];
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                result[index++] = MATRIX[i][right];
            }
            right--;

            if (top <= bottom) {
                // Traverse bottom row
                for (int i = right; i >= left; i--) {
                    result[index++] = MATRIX[bottom][i];
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse left column
                for (int i = bottom; i >= top; i--) {
                    result[index++] = MATRIX[i][left];
                }
                left++;
            }
        }

        return result;
    }
}