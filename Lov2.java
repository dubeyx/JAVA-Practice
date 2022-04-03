package Love450;
import java.util.*;

public class Lov2 {

	public static void main(String[] args) {
	//Maximum and minimum element of a array
//		Integer[] array= {1,2,3,4,5,7,8,0,123,7};
//		System.out.println(Collections.max(Arrays.asList(array)));
//		System.out.println(Collections.min(Arrays.asList(array)));
//		
		
		                 /* OR */
		
		
		int[] array= {1,2,3,4,5,7,8,0,123,7};
		int max=0;
		int min=0;
		for(int i : array)
		{
			max=Math.max(max, i);
			min=Math.max(min, i);
		}
		
		System.out.println("Max -> "+ max);
		System.out.println("Min -> "+ min);
		
		
		

	}

}
