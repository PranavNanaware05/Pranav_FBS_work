package assignment_5;

class Animal {
    protected String name;
    protected int age;
 Animal() {
	this.name="not given";
	this.age=00;
}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }
}

class Cat extends Animal {
     String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    void display() {
        super.display();
        System.out.println("Color: " + color);
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy", 3, "Labrador");
        d.display();

        System.out.println();

        Cat c = new Cat("Kitty", 2, "White");
        c.display();
    }
}