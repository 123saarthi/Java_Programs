//if we dont know how many no. of args pass in the method then varag is the best approach.
public class VaragsDemo 
{
  public static void main(String args[])
  {
	  display();
	  display("hello","hi","Hi");
  }
  static void display(String...values)
  {
	  System.out.println("display method invoked");
	  for(String s: values)
	  {
		  System.out.println(s);
	  }
  }
}

