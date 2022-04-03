package MyCode;

import java.util.*;

public class MyLinkedList {
	Node head;
	void add(int data)
	{
	Node toAdd = new Node(data);
		
		if(isEmpty())
		{
			head=toAdd;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
			
		}
		temp.next=toAdd;
	}
		boolean isEmpty()
		{
			return head==null;
		}
		
		
	
static class Node{
	int data;
	Node next;
	public Node (int data)
	{
		this.data=data;
		next=null;
	}
	
}
void print()
{
	Node temp=head;
	System.out.print("[ ");
	while(temp!=null)
	{
		System.out.print(temp.data + " ");
		temp=temp.next;
	}
	System.out.print("]");
}
void contain(int data)
{
	Node temp=head;
	int m=0;
	while(temp!=null)
{
	if(temp.data==data)
	{
		m=m+1;
	
	}
	
	temp=temp.next;
}
	if(m>=1) System.out.println("true");
	else System.out.println("false");
	
}
void toArray()
{
	List <Integer> i = new ArrayList<>();
	Node temp=head;
	while(temp!=null)
	{
		i.add(temp.data);
		temp=temp.next;
	}
}
	public static void main(String[] args) {
		
		 MyLinkedList m = new  MyLinkedList();
		 m.add(2);
		 m.add(4);
		 m.add(7);
		 m.contain(9);
		 m.toArray();
		 System.out.println(m);
		 
	}

}

