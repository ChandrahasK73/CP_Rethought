import java.io.*;
import java.util.*;
class Prime
{
	public static boolean isPrime(int a)
	{
		for(int i=2;i<=Math.sqrt(a);i++){
			if(a%i==0)return false;
		}
		return true;
	}
	public static void main(String args[])throws java.io.IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine().trim());
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		for(int i=a;i<=b;i++){
			if(isPrime(i) && i!=1)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}