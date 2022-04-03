package New;
import java.util.*;
import java.math.*;
public class BinaryTree {

	public static void main(String[] args) {
		int a = (int)System.currentTimeMillis();
		int[] num= {20000,66};
		List<Integer>li= new ArrayList<>();
		String h="";
		int j=0;
		while(j<num.length )
		{
			String s= ""+num[j];
			for(int i=0;i<s.length();i++)
			{
				li.add((int)Integer.parseInt(""+s.charAt(i)));
			
			}
			
			j++;
			s=null;
			
		}
		Collections.sort(li);
		for(int u=li.size()-1;u>=0;u--)
		{
			h=h+li.get(u);
		}
		
		System.out.println(Integer.parseInt(h));
		int z = (int)System.currentTimeMillis();
		System.out.println(z-a);
		

	}

}
