class Super
{
	int x;
	super(int x)
	{
		this.x=x;
	}
	void display()
	{
		System.out.println("Super X"+x);
	}
}
class Sub extends Super
{
	int y;
	Sub(int x,int y)
	{
		Super(x);
		this.y=y;
	}
}


public class SuperKeyword {

}
