public class VaragsDemo3
{
   public static void vaTest(int ... v)
   {
	   System.out.print("No. of args"+ v.length +"contents:");
	   for(int x:v)
	   {
		   System.out.print(x+" ");
		   
	   }
	   System.out.println();
   }
   public static void vaTest2(String msg, int ... v )
   {
	   System.out.print(msg + v.length + " Contents: ");

	    for (int x : v)
	    {
	      System.out.print(x + " ");
	    }
	    System.out.println();
	  }

   public static void vaTest3(Object ... arg)
   {
	   for (Object ar : arg) 
	   {
		      System.out.print("  " + ar);
	   }
		    System.out.println();

   }		    
   
   public static void main(String args[])
   {
	   vaTest(10);
	   vaTest(1,2,3);
	   vaTest();
	   vaTest2("One vararg: ", 10);
	   vaTest2("Three varargs: ", 1, 2, 3);
	   vaTest2("No varargs: ");
	   vaTest3(2, "two", 4, "four", 4.5, "four point five"); 
	   vaTest3();
	   vaTest3(25, "Anything goes", true, 4E4, false);
   }
}
