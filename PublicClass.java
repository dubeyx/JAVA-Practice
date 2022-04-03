package MyCode;

import java.util.Scanner;

public class PublicClass {

	public static void main(String[] args) {
		int fact=1;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number whose factorial you wann");
		int N = sc.nextInt();
		for(int i=N;i>=1;i--)
		{
			fact= fact*i;
			System.out.println(i);
		}
		System.out.println(+fact);
	}

}
