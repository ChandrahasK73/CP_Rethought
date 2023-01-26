import java.util.*;
import java.io.*;
class In2Pre
{
	public static int prio(char ch)
	{
		switch(ch){
			case '+' :
			case '-' : return 1; 
			case '*' :
			case '/' : return 2; 
			case '^' : return 3; 
		}return -1;
	}
	public static String in2post(String str)
	{
		String res="";
		Stack<Character> stk= new Stack<>();

		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(Character.isLetterOrDigit(ch)) res+=ch;
			else if(ch=='(') stk.push(ch);
			else if(ch==')'){
				while(!stk.empty() && stk.peek()!='('){res+=stk.pop();}
				stk.pop();
			}
			else{
				while(!stk.empty() && prio(ch)>prio(stk.peek())) res+=stk.pop();
			
			stk.push(ch);
			}
		}
		while(!stk.empty()){
			if(stk.peek()=='(') return "Invalid Expression";
			res+=stk.pop();
		}
		return new StringBuilder(res).reverse().toString();
	}
	public static void main(String args[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine().trim();
		System.out.println(in2post(str));
	}
}