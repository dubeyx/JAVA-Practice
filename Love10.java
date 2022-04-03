package Love450;

public class Love10 {
	public static void main(String[] args) {
		int[] arr= {2,1,3,3,4,1,2,1,1,2};
		int max=arr[0];
		int cur=arr[0];
		int jump=1;
		for(int i=1;i<arr.length;i++)
		{
			if(i==arr.length-1) break;
			max=Math.max(max, i+arr[i]);
			if(i==cur)
			{
				cur=max;
				jump++;
			}
			
			
			
		}
		
		
		System.out.println(jump);

	}

}
