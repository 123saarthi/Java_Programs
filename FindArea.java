class Figure
{
	double dim1,dim2;
    public Figure(double a, double b)
    { 
    	dim1 = a;
		dim2 = b;
	}
    double area()
    {
    	System.out.println("Undefined figure");
        return 0;
    }
}
class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Area  for rectrangle");
		return dim1*dim2;
	}
}
class Triangle extends Figure
{
	Triangle(double a, double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Area  for triiangle");
		return dim1*dim2/2;
	}
}
public class FindArea 
{
   public static void main(String[] args)
   {
	   Figure f = new Figure(10, 10);
	   Rectangle r = new Rectangle(9, 5);
	   Triangle t = new Triangle(10, 8);
	   Figure ref;
	   ref=r;
	   System.out.println("Area is " + ref.area());
	   ref = t;
	   System.out.println("Area is " + ref.area());
	   ref = f;
	   System.out.println("Area is " + ref.area());

   }
}
