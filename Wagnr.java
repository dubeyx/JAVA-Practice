package MyCode;
public class Wagnr {
	Node head;
	void add(int data)
	{
		Node toAdd = new Node(data);
		if (head==null)
		{
			head=toAdd;
			return;
		}
		Node temp = head;
		while(temp.next!=null)
		{
			temp.next= toAdd;
		}
	}
	boolean isEmpty()
	{
		return head==null;
	}
	
	static class Node{
		int data;
		Node next;
		public Node(int data)
	
		{
			this.data = data;
		}
		
	}
	void print(){
		Node temp=head;
	while(temp!=null)
	{
		
		System.out.println(temp.data);
		temp=temp.next;
	}
	}
	public static void main(String[] args) {
		Wagnr w = new Wagnr();
		w.add(2);
		w.add(19);
		w.print();
	}

}
