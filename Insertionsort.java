package New;

import java.util.*;

public class Insertionsort {

	public static void main(String[] args) {
		System.out.println("hello world");
		int[] a= {9,8,7,6,501,4,3,2,1,0};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		//selection sort
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]= a[j];
					a[j]=temp;
					
				}
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
