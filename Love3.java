package Love450;
import java.util.*;

public class Love3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kth Maxima or Kth Minima
		
		int[] array= {1,2,3,4,5,7,8,0,123,9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the K ");
		int k = sc.nextInt();
		if(k>array.length && k<=0) {System.out.println("Not Possible") ;return ;}
		Arrays.sort(array);
		System.out.println("Kth Maxima => "+ array[array.length-k]);
		System.out.println("Kth Minima => "+ array[k-1]);
		
		
		
		
		
		
		
		

	}

}
