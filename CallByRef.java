class Ref
{
	int a,b;
	Ref(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void meth(Ref o)//pass an object
	{
		o.a=o.a*2;
		o.b=o.b/2;
	}
}
public class CallByRef 
{
	public static void main(String args[])
	{
		Ref ob=new Ref(15,30);
		System.out.println("Before call"+ob.a+""+ob.b);
		ob.meth(ob);
		System.out.println("after call"+ob.a+""+ob.b);
		
	}

}
