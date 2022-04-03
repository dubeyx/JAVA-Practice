package Love450;

public class Love5 {

	public static void main(String[] args) {
		int[] array= {1,2,-3,-4,5,7,8,0,123,-9};
		int low=0;
		int high=array.length;
		int neg;
		int k=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<0) 
			{
				int temp=array[k];
				array[k]=array[i];
				array[i]=temp;
				k++;
				
			}
			
		}
		
		for(int j=0;j<array.length;j++)
		{
			System.out.print(array[j] + " ");
		}
		
	}

}
