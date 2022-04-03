package Love450;
import java.util.*;

public class Love6 {
	public static int doUnion(int a[], int n, int b[], int m) 
    {
         Set<Integer> s= new HashSet<>();
    	   for(int i=0;i<n;i++)
    	   {
    		   s.add(a[i]);
    	   }
    	   for(int i=0;i<m;i++)
    	   {
    		   s.add(b[i]);
    	   }
       
       return s.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

	}

}
