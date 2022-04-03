package New;

import java.util.*;


public class Per {
	static String swap(String s, int i,int j)
	{
		char[] arr=s.toCharArray();
		String g="";
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		for(int e=0;e<s.length();e++)
		{
			g=g+arr[e];
		}
		
		
		
		
		return g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC";

		Set<String> a= new HashSet<>();
		
		perm(s,0,a);
		List<String> ab = new LinkedList<>(a);
		
		System.out.println(ab);
				
	}
	public static void perm(String s,int i,Set<String> a)
	{
		
		if(i==s.length()) return;
		
		
			for(int k=i;k<s.length();k++)
			{
				
				
				a.add(swap(s,i,k));
				perm(swap(s,i,k),i+1,a);
				
			
		}
		
		
		
		
	}
	
	
	

}
