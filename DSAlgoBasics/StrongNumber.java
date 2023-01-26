import java.io.*;
import java.util.*;
class StrongNumber
{
	public static int fact(int n)
	{
		if(n==0 || n==1) return 1;
		int[] a= new int[n+1];
		a[0]=1; a[1]=1;
		for(int i=2;i<=n;i++) a[i]=i*a[i-1];
		return a[n];
	}
	public static void main(String args[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine().trim());
		int sum=0; int m=n;
		while(n!=0)
		{
			sum+=fact(n%10);
			n/=10;
		}
		if(sum==m) System.out.println("Strong number");
		else System.out.println("Not a strong number");
	}
}