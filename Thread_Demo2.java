class Hi extends Thread
{ public void run()
	{
	 for(int i=1;i<=5;i++)
	 { 
		System.out.println("Hi");
		try{Thread.sleep(500);} catch(Exception e){}
	 }
	}

}
class Hello extends Thread
{
	 public void run()
		{
		 for(int i=1;i<=5;i++)
		 { 
			System.out.println("Hello");
			try{Thread.sleep(500);} catch(Exception e){}
		 }
		}

}

public class Thread_Demo2
{ public static void main(String args[])
	{
  Hi ob1=new Hi();
  Hello ob2=new Hello();
  ob1.start();
	try{Thread.sleep(10);} catch(Exception e){}
	ob2.start();
}
}
