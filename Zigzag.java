package New;
import java.util.*;

public class Zigzag {
	 public static String convert(String s, int numRows) {
	       if(numRows==1) return s;
     int j=0;
     int i=0;
     boolean b=true;
      String[] st = new String[numRows];
      Arrays.fill(st, "");
      while(i>=0 && i<numRows && j<s.length())
      {
          st[i]=st[i] + s.charAt(j);
          
          if(i==0) {b=true;} if(i==numRows-1){b=false;}
          if(b)
          {i=i+1;}
          else if(!b){i=i-1;}
          j++;
          
      }
      String p="";
     for(String l : st)
     {
    	 p=p+l;
     }
    
      return p;
  }
	

	public static void main(String[] args) {
		
		String s = convert("PAYPALISHIRING",3);
		
		System.out.println(s);
		int k=123;
		int l=Integer.reverse(k);
		System.out.println(l);
		
		
	}

}
