package MyCode;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number whose sequence you want");
		int n=sc.nextInt();
		int temp=n;
		
		int sum=0;
		while ( temp>0){
			int lastdig=temp%10;
			temp=temp/10;
			
			
			sum=sum+lastdig;
			
			
		}
		System.out.println(sum);
	
	}
	}
