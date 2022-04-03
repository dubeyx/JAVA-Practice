package New;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Xyz
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc = new Scanner(System.in);
System.out.println("");
int t=sc.nextInt();
String r= sc.nextLine();
while(t>0)
{
    int k=0;
   String s=sc.nextLine();
   int m= s.length();
   if(m<3) {  
       System.out.println("Error"); 
       
   }
  else if(s.charAt(0)!='<' || s.charAt(1)!='/' || s.charAt(m-1)!='>')
   {
       System.out.println("Error");
       
   }
   else if(m==3)
   {
     System.out.println("Error");  
       
   }
   else
   {
       for(int y=2;y<m;y++)
       {
           
           if(!Character.isDigit(s.charAt(y)) && (((int)s.charAt(y))<=96 || ((int)s.charAt(y))>=123))
           {
               
                k=1;
           }
       }
      if(k==0) System.out.println("Success");
      else  System.out.println("Error");
   }
   
   
     
     t=t-1;
    
}
sc.close();






	}
}
