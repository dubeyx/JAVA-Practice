package Love450;

public class Love8 {

	public static int maxSubarraySum(int arr[], int n){
        int max=Integer.MIN_VALUE;
        int sum=0;
       for(int i=0;i<n;i++)
       {
           sum=sum+arr[i];
           if(sum>max) max=sum;
           if(sum<0) sum=0;
           
       }
        
        
        return max;
        
    }
	public static void main(String[] args) {
		// Largest contigous subarray
		int[] array= {-1,-2,-3,-4,-5,-7,-8,0,-4,-9};
		
		System.out.println(maxSubarraySum(array,array.length));
		

	}

}
