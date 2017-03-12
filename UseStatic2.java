class Static2
{
	static int a=6;
	static int b=9;
	static void callMe()
	{
		System.out.println("a="+a);
	}
}

public class UseStatic2
{
   public static void main(String args[])
   {
	   Static2.callMe();
	   System.out.println("b="+Static2.b);
   }
}
