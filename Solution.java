package MyCode;
import java.io.*;
import java.util.*;

public class Solution {
	
	public static int pal(String s, int i, int j)
	{
		int Left=i,Right=j;
		while(Left>=0 && Right<s.length() && s.charAt(Left)==s.charAt(Right))
		{
			Right++;
			Left--;
		}
		
		
		return (Right-Left-1);
	}
	
	
	
	

    public static void main(String[] args) {
        		int start=0,end=0;
        String s= "ababaafgh";
        
       for(int i=0;i<s.length();i++)
       {
    	   int len1 = pal(s,i,i);
    	   int len2 = pal(s,i,i+1);
    	   int len=Math.max(len1,len2);
    	  
    	   if(len>end-start)
    	   {
    		   start = i - ((len-1)>>1);
               end = i + ((len)>>1);
               System.out.println(start);
               System.out.println(end);
    		   
    	   }
    	   
    	   
    	   
       }
        
        
        
        
        
        
        
        
        System.out.println(s.substring(start,end+1).length());
        
    }
}