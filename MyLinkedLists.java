package MyCode;

public class MyLinkedLists {
	Node head;
	void add(int data)
	
	{
		Node toAdd = new Node(data);
		if(head==null)
		{
			head=toAdd;
			return;
		}
		
		Node temp =head;
		while(temp.next!=null)
		{
			temp=temp.next;
			temp.next=toAdd;
		}
	}
	
	
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
		
	}
void print()

{
	Node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data);
		temp=temp.next;
		
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedLists M =new MyLinkedLists();
		M.add(2);
		M.add(3);
		M.print();
		
		

	}

}
