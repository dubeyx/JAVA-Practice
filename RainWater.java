package Love450;

public class RainWater {
	static int trappingWater(int arr[], int n) { 
        if(n<=2) return 0;
        
        int l=0;
        int r=arr.length-1;
        int maxl=0;
        int maxr=0;
        int c=0;
        while(l<r)
        {
            if(arr[l]<=arr[r])
            {
                maxl=Math.max(maxl,arr[l]);
                c=c+maxl-arr[l];
                l++;
            }
            else
            {
                maxr=Math.max(maxr,arr[r]);
                c=c+maxr-arr[r];
                r--;
            }
            
            
            
            
        }
        return c;
        
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3,0,0};
		System.out.println(trappingWater(arr, arr.length));

	}

}
