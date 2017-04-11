public class VaragsAverage
{
    public static double average(double ... v)
    {
    	double av=0.0;
    	for(double value:v)
    	{
    		av+=value;
    	}
    	return av / v.length;
    }
	public static void main(String args[])
   {
	   System.out.println(average(3.0,2.2,3.3,2.1,4.3));
	   
   }
}
