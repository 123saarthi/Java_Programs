public class StringDemo
{
	public static void main(String args[])
	{
		String o1=" First String";
		String o2="Second String";
		String o3=o1;
		System.out.println("String Length(o1):"+o1.length());
		System.out.println("Char at index 3 in o1=="
				+ ""+o1.charAt(3));
		if(o1.equals(o2))
		{
			System.out.println("String o1 equals String o2");
		}
		else
		{
			System.out.println("String o1 not equals String o2");
			
		}
		if(o1.equals(o3))
		{
			System.out.println("String o1 equals String o3");
			
		}
		else
		{
			System.out.println("String o1  not equals String o3");
			
		}
	}

}
