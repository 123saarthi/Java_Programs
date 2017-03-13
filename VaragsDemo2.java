
public class VaragsDemo2
{
  public static void main(String args[])
  {
	  display(100,"Hi","Hello");
	  display(200,"No", "ava","C++");
	  
  }
  static void display(int num, String...s)
  {
	  System.out.println("number is="+num);
	  for(String x : s)
	  {
		  System.out.println(x);
		  
	  }
	 
  }
}

