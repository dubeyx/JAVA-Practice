package New;

import java.util.*;


public class Experiment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"A","B","C","D"};
		List<List<String>> sl = new ArrayList();
		List<String> sm = new ArrayList();
		
		
		for(int i=0;i<s.length;i++)
		{
			
			sm.add(s[i]);
			sl.add(sm);
		}
		
		System.out.println(sm);
		
		
	}

}
