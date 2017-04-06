import java.util.*;
class Boxx
{
	double width, height, depth;
	Boxx()
	{
		width=height=depth=-1;
	}
	Boxx(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	Boxx(double len)
	{
		width=height=depth=len;
	}
	Boxx(Boxx ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	public void accept()
	{
		Scanner scan=new Scanner(System.in);
	
			System.out.println("Enter width, height, and depth respectively");
			width=scan.nextDouble();
			height=scan.nextDouble();
			depth=scan.nextDouble();
		
	}
	public void volume()
	{
		double vol;
		vol=width*height*depth;
		System.out.println(vol);
	}
}
public class ObjectPass
{
	public static void main(String args[])
	{
		Boxx o1=new Boxx();
		Boxx o2=new Boxx(o1);
		o1.accept();
		o1.volume();
		o2.volume();
		
		
		
	}
}

