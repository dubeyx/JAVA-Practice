package Love450;
import java.util.*;

public class Love4 {

	 public static void sort012(int a[], int n)
	    {
	       int low=0;
	       int mid=0;
	       for(int i:a)
	       {
	           if(i==0) low=low+1;
	           else if(i==1) mid=mid+1;
	           
	       }
	       for(int i=0;i<n;i++)
	       {
	           if(low>0) {a[i]=0;low--;}
	           else if(low==0 && mid!=0){a[i]=1;mid--;}
	           else if (mid==0){ a[i]=2;}
	       }
	    }
public static void main(String[] args)
{
	int[] array= {1,2,0,0,1,0,2};
	sort012(array, array.length);
}
}
