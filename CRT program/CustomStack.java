import java.util.Scanner;
import java.util.Stack;
class Main
{
	static class Solution
	{
		public static CustomStack deleteMiddle(CustomStack stack)
		{
			CustomStack st=new CustomStack();
			Stack<Integer> l=new Stack<Integer>();
			while(!stack.empty())l.add(stack.pop());
			for(int j=l.size()-1;j>=0;j--) if(j!=l.size()/2) stack.push(l.get(j));
			return stack;
		}
		public static void printStack(CustomStack stack)
		{
			if(stack.empty()) System.out.print("Empty Stack");
			else while(!stack.empty()) System.out.print(stack.pop()+" ");
		}
	}
	public static void main(String args[])
	{
		CustomStack stack=new CustomStack();
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-- > 0) stack.push(in.nextInt());
		Solution.printStack(Solution.deleteMiddle(stack));
		in.close();
	}
}
class CustomStack
{
	private Stack<Integer> stack;

	public CustomStack()
	{
		this.stack=new Stack<Integer>();
	}
	public void push(int data)
	{
		this.stack.push(data);
	}
	public int pop()
	{
		return this.stack.pop();
	}
	public boolean empty()
	{
		return this.stack.empty();
	}
}