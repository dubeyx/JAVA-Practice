package New;
// reverse the array
public class Love1 {
	public static void main(String[] args)
	{
		int[] array= {1,2,3,4,5,7,8,0,123,7};
		
		for(int i=0;i<array.length/2;i++)
		{
			int temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
			
		}	
		System.out.println("After Reversing ");
		for(int j=0;j<array.length;j++)
		{
			System.out.print(array[j] + " ");
		}
	}
}
