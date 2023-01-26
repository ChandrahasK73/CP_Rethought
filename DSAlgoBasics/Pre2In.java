import java.io.*;
import java.util.*;
class Pre2In
{
	public static boolean isOperand(char ch)
	{
		return Character.isLetter(ch);
	}
	public static String pre2In(String str)
	{
		Stack<String> stk= new Stack<>();
		for(int i=str.length()-1;i>=0;i--)
		{
			if(isOperand(str.charAt(i)))
				stk.push(str.charAt(i)+"");
			else
			{
				String op1= stk.pop();
				String op2= stk.pop();
				stk.push(")"+op2+str.charAt(i)+op1+"(");
			}
		}
		return new StringBuilder(stk.peek()).reverse().toString();
	}
	public static void main(String args[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine().trim();
		System.out.println(pre2In(str));
	}
}