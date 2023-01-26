import java.util.Scanner;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			if(max<a[i]) max=a[i];
		}
		int[] b=new int[max+1];
		for(int i=0;i<n;i++) b[a[i]]++;
		int count=0;
		for(int i=0;i<=max;i++)
		{
			if(b[i]>1 && b[i]%2==0) count=count+b[i];
			else if(b[i]>1 && b[i]%2!=0) count=count+b[i]-1;
		}
		System.out.println(count);
	}
}