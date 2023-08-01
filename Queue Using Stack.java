import java.util.*;
public class Solution{
    static class Queue {
        // Define the data members(if any) here.
private Stack<Integer> s1;
private Stack<Integer> s2;
        Queue() {
            // Initialize your data structure here.
             s1=new Stack<>();
             s2=new Stack<>();
        }

        void enQueue(int val) {
            // Implement the enqueue() function.
             s1.push(val);
        }

        int deQueue() {
            // Implement the dequeue() function.
            if(isEmpty()){
            return -1;
        }
        peek();
        return s2.pop();
        }

        int peek() {
            // Implement the peek() function here.
             if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            return -1;
        }
        return s2.peek();
        }

        boolean isEmpty() {
            // Implement the isEmpty() function here.
           return s1.isEmpty() && s2.isEmpty();
        }
    }
}