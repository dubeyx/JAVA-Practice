package New;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"hello","hii","how","are","you","uoy"};
		Map<String ,List<String>> a= new HashMap();
		for(String s: str)
		{
			char[] c= s.toCharArray();
			String d= new String(c);
			if(!a.containsKey(c))
				  if(!a.containsKey(c)){
		                a.put(d,new LinkedList<String>());}
			
		}
	}

}
