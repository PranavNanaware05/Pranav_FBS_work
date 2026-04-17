package SimplePriorityQueue;

public class Queue1 {

    String[] arr;
    int front;
    int rear;

    public Queue1(int size) {
        this.arr = new String[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

   public  void insert(String s) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
            arr[rear] = s;
            return;
        }

        int i = rear;

        while (i >= 0 && s.compareTo(arr[i]) < 0) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = s;
        rear++;
    }

   public  void delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

   public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
}