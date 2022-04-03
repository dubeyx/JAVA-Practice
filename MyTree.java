package New;
import java.util.*;

public class MyTree {
	static Scanner sc=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	sc=new Scanner(System.in);
			Nodel root =CreateTree();
//			inOrder(root);
//			System.out.println();
//			preOrder(root);
//			System.out.println();
//			postOrder(root);
//			System.out.println();
			levelOrder(root);
	

	}
	
	public static void levelOrder(Nodel node)
	{
		
		Queue<Nodel> q = new LinkedList();
		q.add(node);
		q.add(null);
		
		while(!q.isEmpty())
		{
			
		
			
			
			Nodel nodes=q.peek();
			q.remove();
			
			if(nodes!=null)
			{
				System.out.print(nodes.data + " ");
			if(nodes.left!=null)
			{
				q.add(nodes.left);
			}
			if(nodes.right!=null)
			{
				q.add(nodes.right);
			}	
			
		}
			else if(!q.isEmpty())
			{
				q.add(null);
			}
		
			
			
			}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	static Nodel CreateTree()
	{
		Nodel root=null;
		System.out.println("Enter the Number : ");
		int data=sc.nextInt();
		if(data==-1) { return null;}
		root= new Nodel(data);
		System.out.println("Enter the element left of " + data);
		root.left=CreateTree();
		System.out.println("Enter the element Right of " + data);
		root.right=CreateTree();
		return root;
		
		
		
		
	}
	public static void inOrder(Nodel root)
	{
		
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data);
		inOrder(root.right);
		
		
	}
public	static void preOrder(Nodel root)
	{
		
		if(root==null) return;
		System.out.print(root.data);
		preOrder(root.left);
		
		preOrder(root.right);
		
		
	}
	public static void postOrder(Nodel root)
	{
		
		if(root==null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data);
		
	}

}
class Nodel 
{
	Nodel left ,right;
	int data;
	public Nodel(int data)
	{
		this.data=data;
	}
	
}
