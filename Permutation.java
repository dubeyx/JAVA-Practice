package New;

import java.util.*;

public class Permutation {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	printPermutations("ABC","");
	
		
		

	}
	public static void printPermutations(String ques,String asf)
	{
		if(ques.length()==0)
		{
			System.out.println(ques);
			
		}
		else
		{
		for(int i=0;i<ques.length();i++)
		{
			char ch= ques.charAt(i);
			String qlpart = ques.substring(0,i);
			String qrpart = ques.substring(i+1);
					String roq= qlpart+qrpart;
			printPermutations(roq,asf+ch);
			
		}
		}
	
		
		
		
	}

}
