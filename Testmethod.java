package MyCode;
class akhil{
	public static void main(String[] args) {
		
        System.out.println("hello bro");
         String s ="welcometojava";
         int k=3;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<s.length();i++)
        {
           String c= s.substring(i,i+k);
           System.out.println(c);
        }
     
       
    
	}

}
