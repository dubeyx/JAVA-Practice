package New;

public class SubsetofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.print("");
		subst(s,0,"");
		
		

	}
static void subst(String s,int i,String cur)
{
	if(i==s.length())
	{		System.out.println(cur);
	return;}
	System.out.println(cur);
	subst(s,i+1,cur+s.charAt(i));
	subst(s,i+1,cur);
	
}
	
	
	
	
}
