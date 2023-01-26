import java.util.*;
import java.io.*;
class CustomQueue
{
	static class QNode
	{
		int data;
		QNode next;
		int capacity= 100;
		QNode(int data)
		{
			this.data= data;
			this.next= null;
		}
	}
	static class QueueLink
	{
		QNode rear= null;
		QNode front= null;
		int size=0;
		private void insert(int data)
		{
			this.size++;
			QNode newNode= new QNode(data);
			if(this.size== newNode.capacity)
			{
				System.out.println("Queue OverFlow");
				return;
			}
			else if(rear==null){
				rear= newNode;
				front= newNode;
			}
			else{
				front.next= newNode;
				front= newNode;
			}
		}
		private int delete()
		{
			if(rear==null) return -1;
			this.size--;
			int val= rear.data;
			if(rear.next==null){
				rear= null;
				front = null;
			}
			else{
				QNode temp= rear;
				rear= rear.next;
				temp= null;
			}
			return val;
		}
		private int first()
		{
			if(this.size==0) return -1;
			return rear.data;
		}
		public StringBuilder printList()
		{
			if(this.size==0) return new StringBuilder();
			StringBuilder sb= new StringBuilder();
			QNode curr= rear;
			while(curr!=null)
			{
				sb.append(curr.data+" ");
				curr= curr.next;
			}
			return sb;
		}
		private boolean empty()
		{
			return this.size==0;
		}
		public void offer(int data)
		{
			insert(data);
		}
		public int poll()
		{
			return delete();
		}
		public int peek()
		{
			return first();
		}
		public StringBuilder show()
		{
			return printList();
		}
		public boolean isEmpty()
		{
			return empty();
		}
	}
	static class StackImplement
	{
		QueueLink queue1= new QueueLink();
		QueueLink queue2= new QueueLink();
		private void insert(int data)
		{
			while(!queue1.isEmpty())
			{
				queue2.offer(queue1.poll());
			}
			queue1.offer(data);
			while(!queue2.isEmpty())
			{
				queue1.offer(queue2.poll());
			}
		}
		private int delete()
		{
			if(queue1.isEmpty()) return -1;
			return queue1.poll();
		}
		public void push(int data)
		{
			insert(data);
		}
		public int first()
		{
			if(!queue1.isEmpty()) return queue1.peek();
			return -1;
		}
		public int pop()
		{
			return delete();
		}
		public int peek()
		{
			return first();
		}
	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int noOfCommands= Integer.parseInt(br.readLine().trim());
		QueueLink queue= new QueueLink();
		int i=0;
		while(noOfCommands--!=0)
		{
			StringTokenizer st= new StringTokenizer(br.readLine().trim());
			String str= st.nextToken()+st.nextToken();
			if(str.equals("1X"))
			{
				queue.offer(Integer.parseInt(st.nextToken()));
			}
			else if(str.equals("2X")){
				int val= queue.poll();
				if(val== -1) System.out.println("Queue UnderFlow");
			}
			else{
				System.out.println("Not a valid command");
			}
			System.out.println("Outcome of command : "+ ++i);
			System.out.println("peek : "+queue.peek()+" ");
			if(queue.show().length()==0){
				System.out.println("Line is free ");
			}
			else{
				System.out.println("Exit <- "+queue.show()+"<- Entry ");
			}
			
		}
		
		StackImplement stack= new StackImplement();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop()+" ");
		System.out.println(stack.peek()+" ");
	}
}