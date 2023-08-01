public class Solution {
    class Queue {
        int front, rear;
        int []arr;

        Queue() {
            front = 0;
            rear = -1;
            arr = new int[100001];
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            // Write your code here.
            if(rear==arr.length-1){
                return;
            }
            rear++;
            arr[rear]=e;

        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            // Write your code here.
           if(front>rear){
               return -1;
           }
            int frontElement=arr[front];
            front++;
            return frontElement;
        }
    }
}