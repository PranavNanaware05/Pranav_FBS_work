package genericLinkedList;

public class MainApp {

    public static void main(String[] args) {

       
        LinkedList<Student> l1 = new LinkedList<>();

        Student s1 = new Student(1, "utkarsh", 70);
        l1.insert(s1);  

        Student s2 = new Student(2, "pritish", 80);
        l1.insert(s2);

        l1.display();
    }
}