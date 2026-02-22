package assignment_5;


class Shape {
    double area;

    void display() {
        System.out.println("Area = " + area);
    }
}//class SHape ends here


class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        area = 3.14 * radius * radius;
    }

    
    void display() {
        System.out.println("Radius = " + radius);
        super.display();
    }
}//class Circle ends here


class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void calculateArea() {
        area = 0.5 * base * height;
    }

    
    void display() {
        System.out.println("Base = " + base);
        System.out.println("Height = " + height);
        super.display();
    }
}//class Triangle ends here


class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        area = length * breadth;
    }

    
    void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        super.display();
    }
}//class Rectangle ends here


public class TestShape {
    public static void main(String[] args) {

        System.out.println("----- Circle -----");
        Circle c = new Circle(5);
        c.calculateArea();
        c.display();

        System.out.println("\n----- Triangle -----");
        Triangle t = new Triangle(10, 6);
        t.calculateArea();
        t.display();

        System.out.println("\n----- Rectangle -----");
        Rectangle r = new Rectangle(8, 4);
        r.calculateArea();
        r.display();
    }
}