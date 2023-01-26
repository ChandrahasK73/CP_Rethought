import java.util.*;
class MinReversals
{
	public static int getMinReversals(String str)
	{
		if(str.length()%2==1) return -1;

		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='(') stack.push(c);
			else
			{
				if(!stack.isEmpty() && stack.peek()=='(')stack.pop();
				else stack.push(')');
			}
		}
		int totalLength=stack.size();
		int openingCount=0;
		while(!stack.isEmpty() && stack.peek()=='(')
		{
			stack.pop();
			openingCount++;
		}
		return (totalLength/2)+(openingCount%2);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print(getMinReversals(s.next()));
	}
}