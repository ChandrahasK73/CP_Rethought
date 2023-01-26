import java.util.*;
class Node1
{
	int data;
	Node1 next;
	Node1 prev;
	Node1(int data)
	{
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}
class QueueImplement
{
	public Node1 rear;
	public Node1 front;
	public int size=0;
	public void insertAtRear(int data)
	{
		Node1 newnode= new Node1(data);
		if(rear==null)
		{
			rear=newnode;
			front=newnode;
		}
		else
		{
			newnode.next=rear;
			rear.prev=newnode;
			rear=newnode;
		}
		this.size++;
	}
	public void insertAtFront(int data)
	{
		Node1 newnode=new Node1(data);
		if(front==null)
		{
			rear=newnode;
			front=newnode;
		}
		else
		{
			front.next=newnode;
			newnode.prev=front;
			front=newnode;
		}
		this.size++;
	}
	public void deleteAtRear()
	{
		if(rear==null) return;
		else if(rear.next==null){ rear=null; front=null;}
		else
		{
			Node1 firstnode=rear;
			Node1 next=firstnode.next;
			rear.next.prev=null;
			rear.next=null;
			rear=next;
		}
		this.size--;
	}
	public void deleteAtFront()
	{
		if(front==null) return;
		else if(front.prev==null){rear=null;front=null;}
		else
		{
			Node1 lastnode=front;
			Node1 previ=lastnode.prev;
			front.prev.next=null;
			front.prev=null;
			front=previ;
		}
		this.size--;
	}
	
	public int getSize()
	{
		return this.size;
	}
	public boolean isEmpty()
	{
		return this.size==0;
	}
	public void printQueue()
	{
		Node1 curr=rear;
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
		QueueImplement queue=new QueueImplement();
		queue.insertAtRear(10);
		queue.insertAtRear(20);
		queue.insertAtFront(99);;
		queue.printQueue();
		queue.deleteAtFront();
		queue.printQueue();
		queue.deleteAtRear();
		queue.printQueue();
		System.out.println(queue.getSize());
		System.out.println(queue.isEmpty());
	}
}