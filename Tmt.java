package MyCode;
import java.util.*;
public class Tmt {
	public static  int ram(String s)
	{
		int hash =0;
		for(int z=0;z<s.length();z++)
		{
			
			hash=hash+s.charAt(z);
		}
		return hash;
	}
	public static String tring (String s)
	{
		char[] p = s.toCharArray();
		Arrays.sort(p);
		
		s=String.valueOf(p);
		
		return s;
	}
	public static void main(String[] args) {
		String[] str= {"hello","hii","how","are","you","uoy","iih","oyu","rae","holle","lelho"};
		Set<String> s= new HashSet();
		Set<String> k= new HashSet();
		List<String> u = new ArrayList();
		List<List<String>> v = new ArrayList();
		
		for(String q :str)
		{
			s.add(tring(q));
		}
//		System.out.println(s);
		
		
		for(String z:s)
		{
			for(int p=0;p<str.length;p++)
			{
				if(ram(z)==ram(tring(str[p])))
				{
					
					k.add(str[p]);
				}
			}
			if(k.isEmpty()) {}
			else {
//			System.out.print(k);
			for(String o :k) { u.add(o);}
			System.out.println(u);
			
			
			
			
			}
			u.clear();
			k.clear();
		}
		System.out.println(v.get(0));
		
	}
}
