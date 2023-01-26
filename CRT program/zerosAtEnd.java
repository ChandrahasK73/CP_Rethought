import java.util.*;
class Solution
{
	public static int[] zerosAtEnd(int []a)
	{
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0) a[index++]=a[i];
		}
		while(index<a.length)
		{
			a[index++]=0;
		}
		return a;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		a=Solution.zerosAtEnd(a);
		for(int i:a)
			System.out.print(i+" ");
	}
}