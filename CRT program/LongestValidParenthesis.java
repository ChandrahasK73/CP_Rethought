import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(-1);
		String str=s.next();
		int res=0;
		int flag=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
				stk.push(i);
			else
			{
				stk.pop();
				if(!stk.empty())
					res=Math.max(res,i-stk.peek());
				else
					stk.push(i);
			}
		}
		if(res==0) {System.out.println("No valid paranthesis"); System.exit(1);}
		else{
		for(int i=0;i<=str.length()-res;i++)
		{
			if(logic(str.substring(i,i+res))){
				System.out.println(i+" "+(i+res));
				System.out.println(str.substring(i,i+res));flag=1;break;}
			
		}
		if(flag==0)
			System.out.println("No balanced paranthesis");
		}
	}
	public static boolean logic(String str)
	{
		Stack<Character> stack= new Stack<Character>();
		//System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(') stack.push('(');
			else
			{
				if(stack.isEmpty()) return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}