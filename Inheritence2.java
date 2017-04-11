class A
{
	int i,j;
    A(int i,int j) 
    {
		this.i = i;
		this.j=j;
    }	
	void show()
	{
		System.out.println("i and j"+i+ " "+j);
	}
}
class B extends A
{
	int k;
	B(int a,int b,int c)
	{
		super(a,b);
		k=c;
	}
	void show(String msg)
	{
		super.show();
		System.out.println(msg + k);
	}
}
public class Inheritence2
{
   public static void main(String args[])
   {
	   B ob=new B(1,2,3);
	   ob.show("hi");
	   ob.show();
	   
	   
   }
}
