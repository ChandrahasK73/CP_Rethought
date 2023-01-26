import java.io.*;
import java.util.*;
class Post2In
{
	public static boolean isOperand(char ch)
	{
		return Character.isLetter(ch);
	}
	public static String post2In(String str)
	{
		Stack<String> stk= new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(isOperand(str.charAt(i)))
				stk.push(str.charAt(i)+"");
			else
			{
				String op1= stk.pop();
				String op2= stk.pop();
				stk.push("("+op2+str.charAt(i)+op1+")");
			}
		}
		return stk.peek();
	}
	public static void main(String args[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine().trim();
		System.out.println(post2In(str));
	}
}