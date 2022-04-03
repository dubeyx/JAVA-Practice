package Love450;
import java.util.*;
public class Love9 {
	 static int getMinDiff(int[] arr, int n, int k) {
	        for(int i=0;i<n;i++)
	        {
	            if(arr[i]-k>0)
	            {
	                arr[i]=arr[i]-k;
	            }
	            else 
	            {
	                arr[i]=arr[i]+k;
	            }
	        }
        Arrays.sort(arr);
	        System.out.println(Arrays.toString(arr));
	        return (arr[n-1]-arr[0]);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {2,6,3,4,7,2,10,3,2,1};
//		getMinDiff(array,array.length,5);
		System.out.println(getMinDiff(array,10,5));

	}

}
