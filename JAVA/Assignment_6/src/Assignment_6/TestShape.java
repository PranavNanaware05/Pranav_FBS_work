package Assignment_6;
class Shape {
    double area;

   
    @Override
	public String toString() {
		return "area=" + area ;
	}


	double calculateArea() {
        return area ;
    }
}//class SHape ends here


class Circle extends Shape {
    double radius;

    public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return area = 3.14 * radius * radius;
    }

	@Override
	public String toString() {
		return "radius=" + radius + "\n"+super.toString();
	}

    
}//class Circle ends here


class Triangle extends Shape {
    double base;
    double height;

    public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return area = 0.5 * base * height;
    }

	@Override
	public String toString() {
		return "\nbase=" + base + "\nheight=" + height +"\n"+super.toString();
	}

    
}//class Triangle ends here


class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

   double calculateArea() {
	   return area = length * breadth;
    }

@Override
public String toString() {
	return "length=" + length + "\nbreadth=" + breadth + "\n"+super.toString();
}

    
}//class Rectangle ends here


public class TestShape {
    public static void main(String[] args) {
        Shape s1=new Shape();
        System.out.println("----- Circle -----");
        s1 = new Circle(5);
        s1.calculateArea();
        System.out.println(s1);

        System.out.println("\n----- Triangle -----");
        s1 = new Triangle(10, 6);
        s1.calculateArea();
        System.out.println(s1);
        System.out.println("\n----- Rectangle -----");
        s1 = new Rectangle(8, 4);
        s1.calculateArea();
        System.out.println(s1);
    }
}
