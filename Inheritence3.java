class Aa
{
	void call()
	{
		System.out.println("hi");
	}
}
class Bb extends Aa
{
	void call()
	{
		System.out.println("saarthi");
	}
}
class Cc extends Bb
{
	void call()
	{
		System.out.println("bhatia");
	}
}
public class Inheritence3 
{
   public static void main(String args[])
   {
	   Aa o1=new Aa();
	   Bb o2=new Bb();
	   Cc o3=new Cc();
	   Aa ref;
	   ref=o1;
	   ref.call();
	   ref=o2;
	   ref.call();
	   ref=o3;
	   ref.call();
   }
}

