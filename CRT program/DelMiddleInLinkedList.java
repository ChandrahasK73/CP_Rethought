public void insertAtIndex(int data,int pos)
{	Node current=head;
	Node use=null;
	Node newNode;
	newNode.data=data;
	for(int i=0;i<pos-1;i++)
	{
		current=current.next;
	}
	newNode.next=current.next;
	current.next=newNode;
}

public int findMiddle()
{
	Node slow=head;
	Node fast=head;

	while(fast!=null && fast.next!=null)
	{
		fast=fast.next.next;
		slow=slow.next;
	}
	return slow.data;
}

public int deleteMiddle()
{
	Node slow=head;
	Node fast=head;
	Node prev=null;

	while(fast!=null && fast.next!=null)
	{
		fast=fast.next.next;
		prev=slow;
		slow=slow.next;
	}
	prev.next=slow.next;
	prev=null;
}