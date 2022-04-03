package New;
import java.math.*;
import java.util.*;
public class Codechef {

	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("hello");
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			 double a=sc.nextLong();
			    double b=sc.nextLong();
			    double n=sc.nextLong();
			    
			    if(n%2==0)
			    {
			        a=a*Math.pow(a, b);
			         b=b*Math.pow(2,n/2) ;   
			    }
			    else
			    {
			        a=a*Math.pow(2,(n/2)+1);
			         b=b*Math.pow(2,n/2);
			    }
			    System.out.println(((int)(int)Math.max(a,b)/(int)Math.min(a,b)));
		}
		
	}
}
