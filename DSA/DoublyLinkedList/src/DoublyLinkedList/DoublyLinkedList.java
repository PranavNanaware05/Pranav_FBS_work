package DoublyLinkedList;

public class DoublyLinkedList {

    Node start;   
    int count;    

   
    public DoublyLinkedList() {
        start = null;  
        count = 0;
    }

    // Method to check if list is empty
    public boolean isEmpty() {
        if (start == null)
            return true;
        else
            return false;
    }

    // Method to insert element at a given position
    public void insert(int ele, int pos) {

        // Validate position
        if (pos <= 0 || pos > count + 1) {
            System.out.println("Position is wrong ");
            return;
        }

        // Create new node
        Node nn = new Node(ele);

        // Case 1: Insert at beginning
        if (pos == 1) {
            if (!isEmpty()) {
                nn.setNext(start);  
                start.setPrev(nn);   
            }
            start = nn;   
            count++;
            return;
        }

       
        Node p = start;
        int c = 1;

        while (c < pos && p.getNext() != null) {
            p = p.getNext();
            c++;
        }

        // Case 2: Insert at end
        if (c == pos - 1) {
            p.setNext(nn);     
            nn.setPrev(p);     
            count++;
            return;
        }

        // Case 3: Insert in middle
        count++;

        nn.setPrev(p.getPrev());      
        nn.setNext(p);                
        p.getPrev().setNext(nn);      
        p.setPrev(nn);               
    }
    
    
    public void display()
    {
    	if(isEmpty())
    	{
    		System.out.println("List is empty");
    		return;
    	}
    	Node p=start;
    	while(p!=null)
    	{
    		System.out.println(p.getData());
    		p=p.getNext();
    		
    	}
    }
    
    public void deleteByPosition(int position) {

		if(isEmpty()) {
			System.out.println("List is Empty...!");
			return;
		}
		
		if(position<=0 || position>count) {
			System.out.println("invlid count....!");
			return;
		}
		
		if(position==1) {
			if(count==1) {
				start=null;
				count--;
				return;
			}
			
			start=start.getNext();
			start.setPrev(null);
			count--;
			return;
		}
		
		Node p=start;
		int c=1;
		
		while(c<position) {
			p=p.getNext();
			c++;
		}

		p.getPrev().setNext(p.getNext());
		
		if(p.getNext()!=null)
			p.getNext().setPrev(p.getPrev());
		
		count--;
	}
}