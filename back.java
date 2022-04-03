package MyCode;
import java.util.Scanner;

public class back {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="COURPEDIA";
		String p="PEDIACUOR";
		int count=0;
		if(s.length()==p.length())
		{
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==p.charAt(j))
				{
				 count++;
				}
			}
		}
		if(count==s.length())
			System.out.println("The two strings are Anagram");
		else
			System.out.println("Not Anagram");
		
		}
		else
		{
			System.out.println(" strings are not anagram");
		}
		
		
		
	}

}
