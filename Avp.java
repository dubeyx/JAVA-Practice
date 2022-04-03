
/* package codechef; // don't place package name! */
package New;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Avp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 String s="21" ;
		        
		        Map <Character, Integer> st = new LinkedHashMap();
		        for(int i=0;i<=s.length()-1;i++)
		        {
		            if(st.isEmpty())
		            {
		                st.put(s.charAt(i),1);
		            }
		            else
		            {
		                
		                if(st.containsKey(s.charAt(i)))
		                {
		                    st.put(s.charAt(i),st.get(s.charAt(i))+1);
		                }
		                else
		                {
		                    st.put(s.charAt(i),1);
		                }
		                
		                
		            }
		                
		        }
		        String g="";
		        
		        for(Map.Entry<Character,Integer> entry : st.entrySet())
		        {
		            g=g+entry.getValue()+entry.getKey();
		            
		        }
		        
		   System.out.println(g);
		    }
		    



	}

