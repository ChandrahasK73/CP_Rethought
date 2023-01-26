class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class LinkedList
{
	Node head=null;
	
	public void insertAtTail(int data)
	{
		Node newNode=new Node(data);
		Node curr=head;
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=newNode;
		}
	}
	public void insertAtHead(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	public void insertAtIndex(int index,int data)
	{
		Node newNode=new Node(data);
		Node curr=head;
		for(int i=0;i<index-1;i++)
		{
			curr=curr.next;
		}
		newNode.next=curr.next;
		curr.next=newNode;
	}
	public void deleteAtHead()
	{
		if(head==null)
		{
			System.out.println("Nothing to delete");
			return;
		}
		else
		{
			head=head.next;
		}
	}
	public void deleteAtTail()
	{
		if(head==null)
		{
			System.out.println("Nothing to delete");
			return;
		}
		else
		{
			Node curr=head;
			Node prev=null;
			while(curr.next!=null)
			{
				prev=curr;
				curr=curr.next;
			}
			prev.next=null;
		}
	}
	public void deleteAtIndex(int index)
	{
		Node curr=head;
		Node prev=null;
		for(int i=0;i<index;i++)
		{
			prev=curr;
			curr=curr.next;
		}
		prev.next=curr.next;
	}
	public int findMiddle()
	{
		Node fast=head;
		Node slow=head;
		while(fast!=null & fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.data;
	}
	public void deleteMiddle()
	{
		Node fast=head;
		Node slow=head;
		Node prev=null;
		while(fast!=null && fast.next!=null)
		{
			prev=slow;
			fast=fast.next.next;
			slow=slow.next;
		}
		prev.next=slow.next;
	}
	public void printList()
	{
		Node curr=head;
		while(curr.next!=null)
		{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
	public void threePointerReverse()
	{
		Node curr=head;
		Node prev=null;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=curr.next;
		}
		head=prev;
	}
	public static Node reverseWith Recursion(Node head)
	{
		if(head==null || head.next==null)
			return head;

		last=LinkedList.reverseWithRecursion(head.next);
		head.next.next=head;
		head.next=null;

		return last;
	}
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.insertAtTail(10);
		l.insertAtHead(5);
		l.insertAtTail(11);
		l.insertAtHead(2);
		l.insertAtIndex(2,7);
		l.printList();//2->5->7->10->11
		l.deleteAtHead();
		l.printList();//5->7->10->11
		l.deleteAtTail();
		l.printList();//5->7->10
		l.deleteAtIndex(2);
		l.printList();//5->7
		l.insertAtTail(9);
		System.out.println(l.findMiddle());//7
		l.deleteMiddle();
		l.printList();//5->9
		l.threePointerReverse();
		l.printList();//9->5

	}

}