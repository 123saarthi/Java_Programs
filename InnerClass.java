
class Outer
{
	int Outer_x=100;
	void test()
	{
	   Inner inner=new Inner();
	   inner.display();
	}
	class Inner
	{   int y=10;//y local to inner
		void display()
		{
			System.out.println(+Outer_x);
		}
	}
	void show()
	{
		//System.out.println(y);// error as y is local to class inner
	}
	void test1()
	{
		for (int i=0;i<10;i++)
		{
			class Inner1
			{
				void display1()
				{
					System.out.println("i="+Outer_x);
				}
				
			}
			Inner1 in=new Inner1();
			in.display1();
		}
		
	}
}
public class InnerClass 
{
   public static void main(String args[])
   {
	   Outer outer=new Outer();
	   outer.test();
	   outer.test1();
   }
}
