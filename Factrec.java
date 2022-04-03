package New;

import java.util.Arrays;
import java.util.Scanner;

public class Factrec {
	public static String swap(String a,int i,int j)
	{
		char[] c = a.toCharArray();
		char temp;
		temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		
		return String.valueOf(c);
		
	}
	public static 	void  fact( String str,int left,int right)
		{
		
		if(left==right)
		{
			System.out.print(str);
		}
		else
		{
			for(int i=left;i<right;i++)
			{
//				System.out.print(" "+ i+ ","+ left +" ");
				String swapped= swap(str,left,i);
			System.out.print(" "+ i+ ","+ left +" ");
				fact(swapped,left+1,right);
//				System.out.print(" "+ i+ ","+ left +" ");
			}
		}
		
		
		
	
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String n= sc.next();
		
		fact("abc",0,3);
		
		
		
		
		
		
		
	

	}

}
