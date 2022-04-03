package New;

import java.util.*;

public class Twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,-1,-2};
		Arrays.sort(arr);
int i=0,j=arr.length-1;
while(j>i)
{
	if(arr[i]+arr[j]>0)
	{
		j--;
	}
	else if(arr[i]+arr[j]<0)
	{
		i++;
	}
	else
	{
		System.out.println("Yes");
		break;
	}
	
}
		
		
		
		

		

	}

}
