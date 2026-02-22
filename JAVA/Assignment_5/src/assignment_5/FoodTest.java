package assignment_5;

class Food {
    protected String name;
    protected double price;

    Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Food: " + name);
        System.out.println("Price: " + price);
    }
}

class Pizza extends Food {
    private String size;

   Pizza(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    void display() {
        super.display();
        System.out.println("Size: " + size);
    }
}

class Burger extends Food {
    String cheese;

     Burger(String name, double price, String cheese) {
        super(name, price);
        this.cheese = "cheese";
    }

    void displayBurger() {
        super.display();
        System.out.println("Cheese: " + cheese);
    }
}

 class FoodTest {
    public static void main(String[] args) {
    	Pizza p1=new Pizza("Farmhouse", 350, "Large");
    	Burger b1=new Burger("Veg Burger", 120, "Yes");
    	p1.display();
    	b1.display();
    }
}