import java.util.Scanner;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(s.nextInt()==0)a[i]=-1;
			else a[i]=1;
		}
		for(int i=0;i<n-1;i++)
		{
			int sum=a[i];
			for(int j=i+1;j<n;j++)
			{
				sum=sum+a[j];
				if(sum==0) count++;
			}
		}
		System.out.println(count);
	}
}