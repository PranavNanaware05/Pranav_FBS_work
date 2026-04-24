package CircularLinkedList;

public class CircularLinkedList<T> 
{private Node<T> start;
private Node<T> end;
private int count;
   public CircularLinkedList() {
    start = null;
    end = null;
    count = 0;
     }
   
// Check empty
   public boolean isEmpty() {
       return start == null;
   }
   
// INSERT at position
   public void insert(T ele, int pos) {
	    if (pos < 1 || pos > count + 1) {
	        System.out.println("Invalid position");
	        return;
	    }

	    Node<T> newNode = new Node<>(ele);

	    // Case 1: Empty list
	    if (isEmpty()) {
	        start =newNode;
	        end = newNode;
	        start.setNext(start);
	        count++;
	        return;
	    }
	    // Case 2: Insert at beginning
	     if (pos == 1) {
	        newNode.setNext(start);
	        start = newNode;
	        end.next = start;
	        count++;
	        return;
	    }
	    // Case 3: Insert at end
	   Node<T> p=start;
	   int c=1;
	   while(c<pos-1)
	   {
		   p=p.getNext();
		   c++;
	   }
	   newNode.setNext(p.getNext());
	   p.setNext(newNode);
	   
	    // Case 4: Insert in middle
	    if(p==end)
	    	end=newNode;
	      count++;
	}
   
   public void delete(int pos) {
	    
	    if (isEmpty()) {
	        System.out.println("List is empty");
	        return;
	    }

	    if (pos < 1 || pos > count) {
	        System.out.println("Invalid position");
	        return;
	    }

	    // Case 1: Delete first node
	    if (pos == 1) {
	        // Only one node
	        if (start == end) {
	            start = null;
	            end = null;
	        } else {
	            start = start.getNext();
	            end.setNext(start);
	        }
	        count--;
	        return;
	    }

	    // Case 2 & 3: Delete middle or last node
	    Node<T> p = start;
	    int c = 1;

	    while (c < pos - 1) {
	        p = p.getNext();
	        c++;
	    }

	    Node<T> temp = p.getNext(); // node to delete
	    p.setNext(temp.getNext());

	    // If deleting last node
	    if (temp == end) {
	        end = p;
	    }

	    count--;
	}
   
   public void display() {

	    if (isEmpty()) {
	        System.out.println("List is empty");
	        return;
	    }

	    Node<T> temp = start;

	    while (temp.getNext() != start) {
	        System.out.print(temp.getData());
	        temp = temp.getNext();
	    }

	    // print last node
	    System.out.print(temp.getData() );

	    System.out.println("(back to start)");
	}

}
