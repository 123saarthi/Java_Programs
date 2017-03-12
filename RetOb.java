class Return
{  int a;
   Return(int a)
   {
	   this.a=a;
   }
   Return incByTen()
   { Return ob=new Return(a+10);
	return ob;
	   
   }
}
public class RetOb
{
	public static void main(String args[])
	{
		Return o1=new Return(2);
		Return o2;
		o2=o1.incByTen();
		System.out.println("o1.a"+"\t"+o1.a);
		System.out.println("o2.a"+"\t"+o2.a);
		o2=o1.incByTen();
		System.out.println("o2.a"+"\t"+o2.a);
	}

}
