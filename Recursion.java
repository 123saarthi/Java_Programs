class Factorial
{
	int fact(int n)
	{
		int result;
		if(n==1) return n;
		result=fact(n-1)*n;
		return result;
	}
}

public class Recursion 
{
	public static void main(String args[])
	{
		Factorial o1=new Factorial();
	    System.out.println("Factorial of 4"+"\t\t"+o1.fact(4));
		
	}
}
