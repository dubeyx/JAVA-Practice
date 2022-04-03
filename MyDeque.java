package MyCode;

public class MyDeque <E> {
	Node <E> head,tail;
	public void addToHead(E data)
	{
		Node<E> toAdd= new Node<E>(data);
		if(head==null)
		{
			head=tail=toAdd;
		}
		
	}
	public static class Node<E>
	{
		E data;
		Node <E> next,prev;
		public Node(E data)
		{
			this.data=data;
			this.next=this.prev=null;
		}
	}

}