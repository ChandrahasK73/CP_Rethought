import java.util.*;
class InfixToPostfix
{
	static int prec(char ch)
	{
		switch(ch)
		{
			case '+':
			case '-':return 1;
			case '*':
			case '/':return 2;
			case '^':return 3;
			
		}
		return -1;
	}
	static void infixToPostfix(String str)
	{
		String res=new String("");
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isLetterOrDigit(c)){res=res+c;}
			else if(c=='(')
			{
				st.push(c);
			}
			else if(c==')')
			{
				while(!st.isEmpty() && st.peek()!='(')
					res=res+st.pop();
				if(!st.isEmpty() && st.peek()!='(')
					{System.out.println("Invalid Expression");System.exit(1);}
				else
					st.pop();
			}
			else
			{
				while(!st.isEmpty() && prec(c)<=prec(st.peek()))
				{
					if(st.peek()=='(')
					{System.out.println("Invalid expression");System.exit(1);}
					res+=st.pop();
				}
				st.push(c);
			}

		}
		while(!st.isEmpty())
		{
			if(st.peek()=='(')
			{System.out.println("Invalid Expression");System.exit(1);}
			res+=st.pop();
		}
		System.out.print(res);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		infixToPostfix(str);
	}
}