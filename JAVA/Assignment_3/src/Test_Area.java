class Triangle
{
	int base,height;
	Triangle(int b,int h)
	{
		this.base=b;
		this.height=h;
	}
	
}//class Triangle ends here

class Rectangle
{
	int length,bredth;
	Rectangle(int len,int bre)
	{
		this.length=len;
		this.bredth=bre;
	}
}//class Rectangle ends here

class Circle
{
	int radius;
	Circle(int r)
	{
		this.radius=r;
	}
}//class Circle ends here

class Shape
{
	double area;
	void calculateArea(Triangle t)
	{
		area = 0.5 * t.base * t.height;
		System.out.println("Area of Triangle is:"+area);
	}
	void calculateArea(Rectangle r)
	{
		area=r.bredth*r.length;
		System.out.println("Area of Rectangle is:"+area);
	}
	void calculateArea(Circle c)
	{
		area=3.14*c.radius*c.radius;
		System.out.println("Area of Circle is:"+area);
	}
	
}
 class Test_Area {

	public static void main(String[] args) {
		Triangle t1=new Triangle(2,10);
		Rectangle r1=new Rectangle(10,20);
		Circle c1=new Circle(10);
		
        Shape s1=new Shape();
        s1.calculateArea(t1);
        s1.calculateArea(r1);
        s1.calculateArea(c1);
	}

}
