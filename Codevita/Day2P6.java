import java.io.*;
import java.util.*;
class Solution
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine().trim());
		StringTokenizer st= new StringTokenizer(br.readLine().trim());
		StringBuilder sb= new StringBuilder();
		Stack<Integer> stack= new Stack<>();
		while(st.hasMoreTokens())
		{
			int a= Integer.parseInt(st.nextToken());
			while(!stack.empty() && stack.peek()>=a) stack.pop();
			if(stack.empty()) System.out.println(-1+" ");
			else System.out.print(stack.peek()+" ");
			stack.push(a);
		}
	}
}
