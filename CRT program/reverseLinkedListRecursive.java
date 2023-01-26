import java.util.*;

class Node1
{
	int data;
	Node1 next;
	Node1(int data)
	{
		this.data=data;
		this.next=null;
	}
}

class LinkedList1
{
	Node1 head;
	
	public void insert(int data)
	{
		Node1 newnode= new Node1(data);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}
	
	public Node1 reverseWithRecursion(Node1 head)
	{
		if(head == null || head.next==null)
		{
			return head;
		}
		Node1 newnode = reverseWithRecursion(head.next);
		head.next.next=head;
		head.next=null;

		return newnode;
	}

	public void printList(Node1 head)
	{
		Node1 curr=head;
		while(curr.next!=null)
		{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println(curr.data);

	}

}

class MainMethod
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		LinkedList1 l= new LinkedList1();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			l.insert(s.nextInt());
		}
		l.printList(l.head);
		Node1 newnode = l.reverseWithRecursion(l.head);
		l.printList(newnode);
	}
}