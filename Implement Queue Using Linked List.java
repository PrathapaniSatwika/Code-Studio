/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 class Queue{
     Node front;
     Node rear;
     void push(){};
     Queue() {
         front = null;
         rear = null;
     }
 }

 *****************************************************************/

public class Solution extends Queue{
    public void push(int x) {
        // Write Your Code Here
        Node newNode=new Node(x);
        if(rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }

    public int pop() {
        // Write Your Code Here
        if(front==null)
        return -1;
        int data=front.data;
        front=front.next;
        if(front==null)
            rear=null;
            return data;
    }
}