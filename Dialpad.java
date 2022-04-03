package New;


import java.util.*;

public class Dialpad {
	
	public static void per(List<String> l, String s,String y, int k)
	{
		if(k==y.length()) return;
		for(int i=0;i<s.length();i++)
		{
			l.add(""+s.charAt(i)+y.charAt(k));
		}
		
		per(l,s,y,k+1);
		
	}
	
	
	

	public static void main(String [] args)
	{
		
		String A="2";
		String B="9";
		Map<Character, String > map = new HashMap<>();
		List<String> list =new ArrayList<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		
		per(list,"abc","c"
				+ "",0);
		
		System.out.println(list);
		
		

	}

}
