

/////////* ya to isko lo ya mt lo */////
////

package New;

public class ExpertRec {
	static String Swap(String s, int i, int j)
	{
		char[] ch = s.toCharArray();
		char c=ch[i];
		ch[i]=ch[j];
		ch[j]=c;
		
		
		
	return String.valueOf(ch);	
	}
static void  printPermut(String s,int i, String k)
{
	if(s.length()==i)
		{
		System.out.println(k);
		}
	else
	{
	
	
		

		printPermut(s,i+1, k);
	printPermut(s,i+1, k+s.charAt(i));
	
	
	 
	
		
		
		
	
	
	
	
	
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String s="abc";
printPermut(s,0,"");
		
		
		
		
		
		
		
		
		

	}

}
