import java.util.Scanner;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int[] a=new int[m];
		int[] b=new int[n];
		for(int i=0;i<m;i++) a[i]=s.nextInt();
		for(int i=0;i<n;i++) b[i]=s.nextInt();
		int x=s.nextInt();
		int count=0;
		for(int i=0;i<m;i++)
		{	int k=x-a[i];
			for(int j=0;j<n;j++)
			{
				if(b[j]==k)count++;
			}
		}
		System.out.println(count);
	}
}