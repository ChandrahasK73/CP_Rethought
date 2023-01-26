import java.util.*;
class Stack1
{
	public LinkedList<Integer> stack;
	public LinkedList<Integer> minstack;

	Stack1()
	{
		this.minstack=new LinkedList<Integer>();
		this.stack=new LinkedList<Integer>();
	}
	public void push(int data)
	{
		if(minstack.isEmpty())
		{
			this.minstack.push(data);
		}
		else if(data<this.minstack.peek())
		{
			this.minstack.push(data);
		}
		stack.push(data);
	}
	public int pop()
	{
		if(this.minstack.peek()<=this.stack.peek())
		{
			minstack.pop();
		}
		return stack.pop();
	}
	public int top()
	{
		return this.stack.peek();
	}
	public int getSize()
	{
		return this.stack.size();
	}
	public int getMin()
	{
		return minstack.peek();
	}
}
class MainMethod
{
	public static void main(String args[])
	{
		
		Stack1 stk=new Stack1();
		stk.push(10);//10
		stk.push(20);//20 10
		stk.push(30);//30 20 10
		stk.getSize();//3
		stk.top();//30
		stk.push(5);//5 30 20 10
		System.out.println(stk.getMin());//5
		stk.pop();//30 20 10
		System.out.println(stk.getMin());//10
	}

}