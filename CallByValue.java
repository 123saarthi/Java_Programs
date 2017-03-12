
class Test
{
	void meth(int i, int j)
	{
		i=i*2;
		j=j/2;
		
	}
}
public class CallByValue
{
	public static void main(String args[])
	{
	    Test ob=new Test();
	    int a=15, b=30;
	    System.out.println("Before Call"+a+""+b);
	    ob.meth(a, b);
	    System.out.println("After CaLL"+a+""+b); 
	}
}
