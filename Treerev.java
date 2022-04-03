package MyCode;

import java.util.*;

public class Treerev {
static Scanner sc = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sc=new Scanner (System.in);
		
		Box b = add();
		inOrder(b);
		
		
	}
	public static Box add()
	{
		Box root=null;
		System.out.println("Enter the Number bro");
		int n=sc.nextInt();
		if(n==-1) {return null;}
		root= new Box(n);
		System.out.println("Enter the Left of "+ n);
		root.left=add();
		System.out.println("Enter the Right of " + n);
		root.right=add();
		
		return root;
		
	}
	
	static void inOrder(Box root)
	{
		
		
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data);
		inOrder(root.right);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
 class Box
{
Box left,right;
int data;
public Box(int data)
{
	this.data=data;
}




	
}
