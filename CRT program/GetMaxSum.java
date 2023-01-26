import java.util.*;
class GetMaxSum
{
	public static int getMaxSum(int[] a)
	{
		int maxSum=0;
		int sumTillNow=0;
		for(int i=0;i<a.length;i++)
		{
			sumTillNow=Math.max(a[i],sumTillNow+a[i]);
			maxSum=Math.max(maxSum,sumTillNow);
		}
		return maxSum;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(GetMaxSum.getMaxSum(a));
	}
}