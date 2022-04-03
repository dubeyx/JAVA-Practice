package MyCode;

import java.util.Scanner;
import java.math.*;
public class Power {

	public static void main(String[] args) {
		int result=1;
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("give base");
		int a= sc.nextInt();
		System.out.println("Give value of base");
		int b =sc.nextInt();
		for(int i=1;i<=b;i++)
		{
			result=a*result;
		}
		System.out.println(result);

	}

}
