import java.util.Scanner;
class Solution
{
	public static int climbStairs(int n)
	{
		int[] fib=new int[n+1];
		fib[0]=1;
		fib[1]=1;
		for(int i=2;i<fib.length;i++) fib[i]= fib[i-1]+fib[i-2];
		return fib[n];
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(Solution.climbStairs(n));
	}
}