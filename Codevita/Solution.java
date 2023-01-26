import java.util.*;
import java.io.*;
class Solution
{
	static class SNode
	{
		int data;
		int size= 10;
		SNode next;
		SNode(int data)
		{
			this.data= data;
			this.next= null;
		}
	}
	static class LinkList
	{
		SNode head= null;
		SNode tail= null;
		int length= 0;
		private void insert(int data)
		{
			SNode newNode= new SNode(data);
			this.length++;
			if(head==null){
				head= newNode;
				tail= newNode;
			}
			else{
				tail.next= newNode;
				tail= newNode;
			}
		}
		private int delete()
		{
			this.length--;
			if(head==null) return -1;
			if(head.next==null) {
				SNode temp= head;
				head= null;
				return temp.data;
			}
			else{
				SNode curr= head;
				SNode prev= null;
				while(curr.next!=null) {prev= curr; curr= curr.next;} 
				tail= prev;
				prev.next= null;
				return curr.data;
			}
		}
		private int top()
		{
			if(tail==null) return -1;
			return tail.data;
		}
		private boolean isEmpty()
		{
			return this.length== 0;
		}
		public void push(int data)
		{
			insert(data);
		}
		public int pop()
		{
			return delete();
		}
		public int peek()
		{
			return top();
		}
		public boolean empty()
		{
			return isEmpty();
		}
	}
	static class QueueImplement
	{
		LinkList stack1= new LinkList();
		LinkList stack2= new LinkList();
		private void insert(int data)
		{
			
			while(!stack1.empty())
			{
				stack2.push(stack1.pop());
			}
			stack1.push(data);
			while(!stack2.empty())
			{
				stack1.push(stack2.pop());
			}
		}
		private int delete()
		{
			if(stack1.empty()) return -1;
			return stack1.pop();
		}
		public void offer(int data)
		{
			insert(data);
		}
		public int poll()
		{
			return delete();
		}
	}
	
		public static void main(String args[]) throws Exception
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			int noOfCommands= Integer.parseInt(br.readLine().trim());
			LinkList stack= new LinkList();
			while(noOfCommands--!=0)
			{
				StringTokenizer st= new StringTokenizer(br.readLine().trim());
				String str= st.nextToken()+st.nextToken();
				if(str.equals("1X")) 
					stack.push(Integer.parseInt(st.nextToken()));
				else{
					if(str.equals("2X"))
					{
						if(st.hasMoreTokens()){ System.out.println("Invalid Input"); continue; }
						int ans= stack.pop();
						if(ans== -1){System.out.println("UnderFlow");}
						else System.out.println(ans+" ");
					}
				}
			}
			//StringTokenizer st= new StringTokenizer(br.readLine().trim());
			QueueImplement queue= new QueueImplement();
			queue.offer(10);
			queue.offer(20);
			System.out.println(queue.poll());
		}
	
}