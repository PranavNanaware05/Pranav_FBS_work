package CircularQueue;



public class Queue {
      
	int[] arr;
	int front;
	int rear;
	public Queue(int size) {
		super();
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isEmpty() {
		if((rear==-1 && front==0)|| rear+1==front)
			 return true;
		else 
			 return false;
	}
	
	public boolean isFull(){
		
		if(rear==arr.length-1)
			 return true;
		else
			return false;
	}
	void insert(int ele) {
		if(isFull() ) {
			System.out.println("Queue is full");
			return;
		}
		
		if(rear==arr.length-1 && front!=0) {
			rear=0;
		}
		else {
			rear++;
			arr[rear]=ele;
		}
	}
	
	public void delete(){
		
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		
		if(rear==front) {
			rear=-1;
			front=-1;
		}
		else if(front==arr.length-1 && rear!=front){
			front=0;
			
		}
		else {
			front++;
			
		}
	}	
	void display(){
		
		if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
		
		for(int i=front;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
}