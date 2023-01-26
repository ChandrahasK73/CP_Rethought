import java.util.Scanner;
class Main
{
	public static class Node
	{
		int data;
		Node next;

		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	public static class ListUtil
	{
		public static Node reverseEvenNodes(Node head)
		{
			return ListUtil.reverse(head,null);
		}
		public static Node reverse(Node head,Node prev)
		{
			// Base case 
			if (head == null) 
				return null; 
		  
			Node temp; 
			Node curr; 
			curr = head; 
		  
			// Reversing nodes until curr node's value 
			// turn odd or Linked list is fully traversed 
			while (curr != null && curr.data % 2 == 0)  
			{ 
				temp = curr.next; 
				curr.next = prev; 
				prev = curr; 
				curr = temp; 
			} 
		  
			// If elements were reversed then head 
			// pointer needs to be changed 
			if (curr != head)  
			{ 
				head.next = curr; 
		  
				// Recur for the remaining linked list 
				curr = reverse(curr, null); 
				return prev; 
			} 
		  
			// Simply iterate over the odd value nodes 
			else
			{ 
				head.next = reverse(head.next, head); 
				return head; 
			} 
		}
		public static void main(String[] args)
		{
			Scanner scanner=new Scanner(System.in);
			Node head=null;
			int n=scanner.nextInt();
			for(int i=0;i<n;i++)
			{
				if(head==null) head=new Node(scanner.nextInt());
				else
				{
					Node curr=head;
					while(curr!=null && curr.next!=null) curr=curr.next;
					curr.next=new Node(scanner.nextInt());
				}
			}
			Node curr=ListUtil.reverseEvenNodes(head);
			while(curr!=null)
			{
				System.out.print(curr.data+" ");
				curr=curr.next;
			}
			scanner.close();
		}
	}
}