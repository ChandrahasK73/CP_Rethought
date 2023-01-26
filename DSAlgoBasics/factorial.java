import java.io.*;
class factorial
{
	public static long factorial(int n)
	{
		if(n==0 || n==1) return 1;
		long[] a= new long[n+1];
		a[0]=1; a[1]=1;
		for(int i=2;i<=n;i++) a[i]=i*a[i-1];
		return a[n];
	}
	public static void main(String args[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine().trim());
		System.out.println(factorial(n));
	}
}