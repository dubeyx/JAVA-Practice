package MyCode;
import java.util.*;

public class Reverse {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter the String");
String name = sc.nextLine();
int i =name.length()-1;
		String ans="";
		while(i>=0)
		{
while(i>=0 && name.charAt(i)==' ')i--;
			int k=i;
			if(i<0)break;
while(i>=0 && name.charAt(i)!=' ')i--;
			if(ans.isEmpty())
			{
ans=ans.concat(name.substring(i+1,k+1));
			}else
			{
ans=ans.concat( " " +name.substring(i+1,k+1));
			}

		}
		
		System.out.println(ans);


	}
	

}
