import java.util.*;
public class Solution {
    public static int maxDepth(String s) {
        // Write your code here.
        int maxDepth=0;
        int currDepth=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                stack.push(c);
                currDepth=stack.size();
                maxDepth=Math.max(maxDepth,currDepth);
            } else if(c==')'){
                stack.pop();
            }
        }
        return maxDepth;
    }
}