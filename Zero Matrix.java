import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if the first row contains any zero
        for (int j = 0; j < m; j++) {
            if (matrix.get(0).get(j) == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if the first column contains any zero
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(0) == 0) {
                firstColZero = true;
                break;
            }
        }

        // Mark zeros in the first row and column
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0);
                    matrix.get(0).set(j, 0);
                }
            }
        }

        // Set rows to zeros
        for (int i = 1; i < n; i++) {
            if (matrix.get(i).get(0) == 0) {
                for (int j = 1; j < m; j++) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        // Set columns to zeros
        for (int j = 1; j < m; j++) {
            if (matrix.get(0).get(j) == 0) {
                for (int i = 1; i < n; i++) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        // Set first row to zeros
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }

        // Set first column to zeros
        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }
}