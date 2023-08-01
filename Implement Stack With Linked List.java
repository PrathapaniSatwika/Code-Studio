class LinkedListNode 
{
    int data;
    LinkedListNode next;
    
    LinkedListNode(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

public class Stack 
{
    
    //Make the class variables here
   LinkedListNode head;
   private int size;

    public Stack() 
    {
        //Implement the default constructor
        head=null;
        size=0;
    }

    public int getSize() 
    {
        //Implement the function
          return size;
        
    }
    
    public boolean isEmpty() 
    {
        //Implement the function
        return head==null;
    }

    public void push(int data) 
    {
        //Implement the function
        LinkedListNode newNode=new LinkedListNode(data);
        if(isEmpty()){
            head=newNode;
        } else{
        newNode.next=head;
        head=newNode;
        }
        size++;
    }

    public int pop() 
    {
        //Implement the function
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        size--;
        return top;
    }

    public int getTop() 
    {
        //Implement the function
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
}