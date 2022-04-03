package New;

import java.util.*;

public  class Matrixpermtation {
	static ArrayList<String> arl = new ArrayList();
	public static String[] swap(String[] a,int i,int j)
	{
		String temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
		
		return a;
	}
	
	public static void calculate(String[] a, int m,int n)
	{
		if(m==n)
		{
//		System.out.println(a);
			arl.add(merge(a));
		}
		else
		{
			for(int i=m;i<a.length;i++)
			{
				String[] s =  swap(a,m,i) ;
				calculate(s,m+1,n);
				
			}
		}
		
		
		
		
	}
	
	public static String merge(String [] st)
	{
		String m ="";
		for(int i=0;i<st.length;i++)
		{
			m=m+st[i];
		}
return m;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] st = {"A","b"};
		
		calculate(st,0,st.length);
		
		System.out.println(arl);
		
		
		
		
		

	}

}
