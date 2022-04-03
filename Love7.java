package Love450;

public class Love7 {
	  
    public void rotate(long arr[], long n)
    {
        long  v=arr[(int)(n-1)];
        for(long i=0;i<n;i++)
        {
            if(i==n-1) {arr[0]=v;}
            else
            {
            arr[(int) (n-1-i)]=arr[(int)(n-2-i)];
            }
        }
            
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
