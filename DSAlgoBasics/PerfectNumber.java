import java.util.*;
import java.io.*;
class PerfectNumber
{
	public static boolean isPerfectNumber(int n)
	{
		int sum=1;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0){
			if(i*i!=n) sum+= i+n/i;
			else sum+=i;
			}
		}
		return (sum==n && n!=1);
	}
	public static void main(String args[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine().trim());
		if(isPerfectNumber(n))
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");
	}
}