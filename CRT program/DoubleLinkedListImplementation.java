class Node1
{
	int data;
	Node1 left;
	Node1 right;
}
class LinkedList1
{
	Node1 head;
	Node1 tail;
	void insertAtStart(int data)
	{
		Node1 n=new Node1();
		n.data=data;
		n.left=null;
		n.right=head;
		head=n;
	}
	void insert(int data)
	{
		Node1 n=new Node1();
		n.data=data;
		n.left=null;
		n.right=null;
		if(head==null)
		{
			head=n;
			tail=n;
		}
		else
		{
			Node1 n1=head;
			while(n1.right!=null)
			{
				n1=n1.right;
			}
			n1.right=n;
			n.left=n1;
			tail=n;
		}
	}
	void insertAt(int data,int index)
	{
		Node1 n=new Node1();
		n.data=data;
		n.right=null;
		n.left=null;
		if(index==0)
		{
			insertAtStart(data);
		}
		else
		{
			Node1 n1=head;
			Node1 n2=null;
			for(int i=0;i<index-1;i++)
			{
				n1=n1.right;
			}
			n2=n1.right;
			n1.right=n;
			n.right=n2;
			n.left=n1;
			n2.left=n;

		}
	}

	void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.right;
			head.left=null;
		}
		else
		{
			Node1 n=head;
			Node1 n1=null;
			Node1 n2=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.right;
			}
			n1=n.right;
			n2=n1.right;
			n2.left=n1.left;
			n.right=n1.right;
			n1=null;

		}
	}
	void show()
	{
		Node1 n=head;
		while(n.right!=null)
		{
			System.out.print(n.data+"->");
			n=n.right;
		}
		System.out.println(n.data);
	}
	void show2()
	{
		Node1 n=tail;
		while(n.left!=null)
		{
			System.out.print(n.data+"->");
			n=n.left;
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
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.show();
		list.show2();
		list.insertAt(20,1);
		list.show();
		list.show2();
		list.deleteAt(2);
		list.show();
		list.show2();
		list.insertAtStart(5);
		list.show();
		list.show2();

	}
}