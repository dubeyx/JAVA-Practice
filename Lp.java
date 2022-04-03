package New;

public class Lp {
	public static String swap(String a,int b,int c)
	{
		char[] ar = a.toCharArray();
		char temp;
		temp=ar[b];
		ar[b]=ar[c];
		ar[c]=temp;
		return String.valueOf(ar);
	}
	
	public static void calcualte(String s, int init ,int len)
	{
		if(init==len) {System.out.println(s);}
		else
		{
			for(int i=init;i<len;i++)
			{
				String swaped = swap(s,i,init);
				
				calcualte(swaped,init+1,len);
				
				
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		calcualte("",0,0);
		
		
		
		
		

	}

}
