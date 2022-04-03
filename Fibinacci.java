package MyCode;
import java.util.Scanner;

public class Fibinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	System.out.println("enter no of sequence");
	int n= sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a);
		System.out.print(b);
		for (int i=0;i<=n-2;i++)
		{
			int c= a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
	}

}
