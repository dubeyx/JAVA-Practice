package MyCode;

import java.util.Scanner;

public class Revera {

public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter string");
	String str = sc.nextLine();
	StringBuilder sb = new StringBuilder(str);
	
	System.out.println(sb.reverse().toString());
	

	}

}
