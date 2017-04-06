import java.util.*;
public class ArrayAscend 
{  int num[];
  public void accept()
  {
	  int num[]=new int[10];
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter 10 num");
	  for(int i=0;i<10;i++)
	  {
		  num[i]=scan.nextInt();
	  }
  }
  public void display()
  {   
	  System.out.println("Numbers before sorting are:"); 
	  for(int j=0;j<10;j++)
	  {

		  System.out.println(num[j]);
	  }
  }
}
