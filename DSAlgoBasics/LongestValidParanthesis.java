import java.io.*;
import java.util.*;
class LongestValidParanthesis
{
	public static boolean isBalancedParanthesis(String str)
	{
		Stack<Character> stk= new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(') stk.push(str.charAt(i));
			else
			{
				if(stk.empty()) return false;
				else if(stk.pop()!='(') return false;
			}
		}
		return stk.empty();
	}
	public static String longestValidParanthesis(String str)
	{
		Stack<Integer> stk= new Stack<>();
		stk.push(-1);
		int res=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')stk.push(i);
			else
			{
				if(!stk.empty()) res=Math.max(res,i-stk.peek());
				else stk.push(i);
			}
		}
		if(res==0) return "No valid paranthesis";
		String ans="";
		for(int i=0;i<str.length()-res;i++)
		{
			if(isBalancedParanthesis(str.substring(i,i+res)))
				ans=str.substring(i,i+res);
		}
		return ans;
	}
	public static void main(String args[])throws java.io.IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine().trim();
		System.out.println(longestValidParanthesis(str));
	}
}