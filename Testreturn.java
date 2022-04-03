package MyCode;
import java.util.*;
import java.lang.Math;

public class Testreturn {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        System.out.println(A.length()+B.length());
	        int t=0;
	        int m=0;
	        if(A.length()>B.length()) t=A.length();
	        else if (A.length()<B.length()) t=B.length();
	        else t=A.length();
	       for (int i=0;i<t;i++)
	       {
	           if(A.charAt(i)<B.charAt(i)) 
	           {
	               System.out.println("No");
	               m++;
	               break;
	           }
	           else if(A.charAt(i)>B.charAt(i))
	           {
	               System.out.println("Yes");
	               m++;
	               break;   
	           }
	           else if (A==B)
	           {
	               System.out.println("No");
	               m++;
	           }
	           if (m==0)
	           {
	               if(A.length()>B.length())
	               {
	                   System.out.println("Yes");
	                   break;
	               }
	               
	               else if(A.length()<B.length())
	               {
	                   System.out.println("No");
	                   break;
	               }
	           }
	           
	       }
	       String C =A.substring(0,1).toUpperCase()+A.substring(1);
	        String D = B.substring(0,1).toUpperCase()+B.substring(1);
	       
	        System.out.println((C.concat(" "+D)));
	        
	        
	    }
	}
