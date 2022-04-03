package MyCode;
import java.util.*;
import java.util.Arrays;
public class Hellonew {
public static void main(String[] args) {
		int[] arr = {2,-5,3,0,5};
		Arrays.sort(arr);
		int m=0;
				
		int i=0;
				int j = arr.length-1; 
	while(i<j)
	{
		if(arr[i]+arr[j]>m)
		{
			j--;
		}
		else if(arr[i]+arr[j]<m)
		{
			i++;
		}
		else
		{
			System.out.println(arr[i]+","+arr[j]);
		
		}
	}
	}

}
