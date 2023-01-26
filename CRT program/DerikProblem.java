import java.util.Scanner;
class Solution
{
	public static int fact(int n)
	{
		if(n<2) return n;
		else return n*fact(n-1);
	}
	public static int permute(int n,int r)
	{
		if(n==r) return fact(n);
		return fact(n)/fact(n-r);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+permute(k,(i+1)/2);
		}
		System.out.println(sum);
	}
}