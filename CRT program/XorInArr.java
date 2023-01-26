import java.util.*;
class Solution
{
	public static int fact(int n)
	{
		if(n<2) return n;
		else return n*fact(n-1);
	}
	public static int comb(int n,int r)
	{
		if(n==r) return 1;
		else return fact(n)/(fact(n-r)*fact(r));
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){ a[i]=s.nextInt(); if(a[i]>max) max=a[i]; }
		int[] freq=new int[max+1];
		for(int i=0;i<n;i++) freq[a[i]]++;
		int sum=0;
		for(int i=0;i<=max;i++)
		{
			if(freq[i]>1) sum=sum+comb(freq[i],2);
		}
		System.out.println(sum);
	}
}