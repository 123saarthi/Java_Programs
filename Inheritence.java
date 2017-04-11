class Student1
{   int sid;
    String studname;
    public void display1()
    {
    	System.out.println("Above superclass constructor");
    }
	public Student1()
	{
		System.out.println("I am in superclass constructor");
		sid=1001;
		studname="suresh";
	}
	public void display()
	{
		System.out.println("sid="+sid);
		System.out.println("studname="+studname);
		
	}
}
class Honour extends Student1
{
	
	String honour;
	public void display2()
    {
    	System.out.println("Above subclass constructor");
    }
	
	public Honour()
	{   System.out.println("I am in subclass constructor");
		honour="Physics";
	}
	public void show()
	{
		System.out.println("honour="+honour);
		
	}
}


public class Inheritence 
{
  public static void main(String args[])
  {
	  Honour obj=new Honour();
	  obj.display1();
	  obj.display2();
	  obj.display();
	  obj.show();
	  
	  
  }
}
