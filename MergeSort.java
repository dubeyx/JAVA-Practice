package New;

public class MergeSort {

	 static long inversionCoun(long[] a, int l, int r)
	{
		long c=0;
		
		if(l<r)
		{
			int mid=l+(r-l)/2;
			c=c+inversionCoun(a,l,mid);
			c=c+inversionCoun(a,mid+1,r);
			c=c+merge(a,l,mid,r);
		}
		return c;
	}
	public static long merge(long[] arr, int l,int mid,int r)
	{
		long c=0;
		int n1=mid-l+1;
				int n2=r-mid;
				long[] a = new long[n1];
				long[] b = new long[n2];
				for(int i=0;i<n1;++i)
				{
					a[i]=arr[l+i];
				}
				for(int i=0;i<n2;++i)
				{
					b[i]=arr[mid+1+i];
				}
				
				
				
				
				
				int i=0;
				int j=0;
				int k=l;
				while(i<n1 && j<n2)
				{
					if(a[i]<b[j])
					{
						arr[k]=a[i];
						
						i++;
						
						
					}
					else 
					{
						arr[k]=b[j];
						
						j++;
						c=n1-i;
						
					}
					k++;
				}
				
				while(i<n1)
				{
					arr[k]=a[i];
					i++;
					k++;
				}
				while(j<n2)
				{
					arr[k]=b[j];
					j++;
					k++;
				}	
				return c;
		
	}
	
	
		
	public static void main(String[] a)	
	{
		long[] ar=  {2, 3,4,5,6,0};
long c=	inversionCoun(ar,0,ar.length-1);
System.out.println(c);
	
		for(int r=0;r<ar.length;r++)
		{
			System.out.print(ar[r] + " ");
		}
		
		

	}

}


///* Java program for Merge Sort */
//class MergeSort
//{
//	// Merges two subarrays of arr[].
//	// First subarray is arr[l..m]
//	// Second subarray is arr[m+1..r]
//	void merge(int arr[], int l, int m, int r)
//	{
//		// Find sizes of two subarrays to be merged
//		int n1 = m - l + 1;
//		int n2 = r - m;
//
//		/* Create temp arrays */
//		int L[] = new int[n1];
//		int R[] = new int[n2];
//
//		/*Copy data to temp arrays*/
//		for (int i = 0; i < n1; ++i)
//			L[i] = arr[l + i];
//		for (int j = 0; j < n2; ++j)
//			R[j] = arr[m + 1 + j];
//
//		/* Merge the temp arrays */
//
//		// Initial indexes of first and second subarrays
//		int i = 0, j = 0;
//
//		// Initial index of merged subarry array
//		int k = l;
//		while (i < n1 && j < n2) {
//			if (L[i] <= R[j]) {
//				arr[k] = L[i];
//				i++;
//			}
//			else {
//				arr[k] = R[j];
//				j++;
//			}
//			k++;
//		}
//
//		/* Copy remaining elements of L[] if any */
//		while (i < n1) {
//			arr[k] = L[i];
//			i++;
//			k++;
//		}
//
//		/* Copy remaining elements of R[] if any */
//		while (j < n2) {
//			arr[k] = R[j];
//			j++;
//			k++;
//		}
//	}
//
//	// Main function that sorts arr[l..r] using
//	// merge()
//	void sort(int arr[], int l, int r)
//	{
//		if (l < r) {
//			// Find the middle point
//			int m =l+ (r-l)/2;
//
//			// Sort first and second halves
//			sort(arr, l, m);
//			sort(arr, m + 1, r);
//
//			// Merge the sorted halves
//			merge(arr, l, m, r);
//		}
//	}
//
//	/* A utility function to print array of size n */
//	static void printArray(int arr[])
//	{
//		int n = arr.length;
//		for (int i = 0; i < n; ++i)
//			System.out.print(arr[i] + " ");
//		System.out.println();
//	}
//
//	// Driver code
//	public static void main(String args[])
//	{
//		int arr[] = { 5,4,6,2 };
//
//		System.out.println("Given Array");
//		printArray(arr);
//
//		MergeSort ob = new MergeSort();
//		ob.sort(arr, 0, arr.length - 1);
//
//		System.out.println("\nSorted array");
//		printArray(arr);
//	}
//}
///* This code is contributed by Rajat Mishra */
