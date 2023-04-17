import java.util.ArrayList;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {
    int n = arr.size();
    for (int i = 0; i < n; i++) {
        int index = Math.abs(arr.get(i)) - 1;
        if (arr.get(index) > 0) {
            arr.set(index, -arr.get(index));
        } else {
            return Math.abs(arr.get(i));
        }
    }
    return -1; // if no duplicate found
}

}


