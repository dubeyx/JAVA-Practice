package New;
import java.util.*;

public class Codefor {
	
	
	
	public static int  soam(List<Integer>l , int x, int k)
	{
		int max=0;
		for(int i=0;i<l.size();i++)
		{
			max=max+ (int)Math.ceil((double)l.get(i)/x);
			
		}
		l.set(k-1, l.get(k)+l.get(k-1));
		l.set(k,0);
		
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int mx=0;
			int mn=0;
			int n= sc.nextInt();
			int x=sc.nextInt();
			List<Integer> l = new ArrayList<>();
			for(int j=0;j<n;j++)
			{
				int g=sc.nextInt();
				l.add(g);
				
			}
			int k=l.size()-1;
			while(k!=1)
			{
				
				mx=Math.max(soam(l,x,k),mx);
				mn=Math.min(soam(l,x,k),mx);
				
				
				k--;
				
			}
			
			
			
			
			
			System.out.println(mn + " "+ 1);
			
			
			
		    
		    
		}
		sc.close();
		
		
		

	}

}
