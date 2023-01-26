import java.io.*;
import java.util.*;
class Gcd
{
	public static int gcd(int a, int b)
	{
		if(a==0) return b;
		if(b==0) return a;
		if(a>b) return gcd(a%b,b);
		else if(a<b) return gcd(a,b%a);
		else return a;
	}
	public static void main(String args[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine().trim());
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		System.out.println("gcd of "+a+" and "+b+" is "+gcd(a,b));
	}
}