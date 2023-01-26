class Node1
{
	int data;
	Node1 next;
}

class LinkedList1
{
	Node1 head;
	public void insert(int data)
	{
		Node1 n=new Node1();
		n.data=data;
		n.next=null;
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node1 n1=head;
			while(n1.next!=null)
			{
				n1=n1.next;
			}
			n1.next=n;
		}
	}
	
	public void insertAtStart(int data)
	{
		Node1 n=new Node1();
		n.data=data;
		n.next=head;
		head=n;
	}

	public void insertAt(int index,int data)
	{
		Node1 n=new Node1();
		n.data=data;
		n.next=null;
		if(index==0)
		{
			insertAtStart(data);
		}
		else
		{
			Node1 n1=head;
			for(int i=0;i<index-1;i++)
			{
				n1=n1.next;
			}
			n.next=n1.next;
			n1.next=n;
		}
	}
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node1 n=head;
			Node1 n1=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			n1=null;
		}
	}
	public void reverse()
	{
		Node1 current=head;
		Node1 prev=null;
		Node1 next=null;
		while(current!= null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	public void show()
	{
		Node1 n=head;
		while(n.next!=null)
		{
			System.out.print(n.data+"->");
			n=n.next;
		}
			System.out.println(n.data);
	}
}


class MainMethod
{
	public static void main(String args[])
	{
		LinkedList1 list=new LinkedList1();
		list.insert(10);
		list.insert(20);
		list.insert(40);
		list.insert(50);
		list.show();
		list.insertAt(2,30);
		list.show();
		list.insertAt(0,0);
		list.show();
		list.deleteAt(2);
		list.show();
		list.reverse();
		list.show();
	}
}