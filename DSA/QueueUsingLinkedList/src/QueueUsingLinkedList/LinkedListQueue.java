package QueueUsingLinkedList;

public class LinkedListQueue {

	
	Node front,rear;
	int count;
	LinkedListQueue() {
        front = null;
        rear= null;
        count = 0;
    }
	
	 public boolean isEmpty() {
	        return front == null;
	    }
	 
	 //insert at rear
	 public void enqueue(int ele) {
	        Node newNode = new Node(ele);

	        if (isEmpty()) {
	            front  = newNode;
	            rear=newNode;
	        } else {
	            rear.setNext(newNode);
	            rear = newNode;
	        }
	        count++;
	    }
	 //delete()
	 public void delete() {
	        if (isEmpty()) {
	            System.out.println("Queue is Empty");
	            return;
	        }

	        System.out.println( front.getData());
	        front = front.getNext();
	        count--;

	        if (front == null) {
	            rear = null;
	        }
	    }
	 
	 /*public void peek() {
	       if (isEmpty()) {
	            System.out.println("Queue is Empty");
	            return;
	        }

	        System.out.println("Front element: " + front.getData());
	    }*/
	 
	   public void display()
	   {
		   if(isEmpty())
		   {
			   System.out.println("Queue is empty");
		   }
		   Node p=front;
		   while(p!=null)
		   {
			   System.out.println(p.getData());
			   p=p.getNext();
		   }
		   
	 }
	   
	   
	   
	   
}
