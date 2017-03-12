// we use getter and setter methods to access private variables
class Testt
{
	int a;
	public int b;
	private int c;
	void setc(int i)
	{
		c=i;
	}
	int getc()
	{
     	return c;
	}
}
public class AccessTest 
{
	public static void main(String args[])
	{
		Testt ob=new Testt();
		ob.a=10;
		ob.b=20;
		//ob.c=30;//cannot access directly
		ob.setc(30);
		System.out.println("a="+ob.a+"b="+ob.b+"c="+ob.getc());
	}

}
