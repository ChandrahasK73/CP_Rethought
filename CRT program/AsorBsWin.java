import java.util.Scanner;
class Solution
{
	public static boolean isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) count++;
		}
		if(count==2) return true;
		else return false;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int asWinCount=0;
		int bsWinCount=0;
		int i=1;
		while(i<=n)
		{
			int num=s.nextInt();
			if(!isPrime(num) && i%2!=0) asWinCount++; else bsWinCount++;
			if(!isPrime(num) && i%2==0)  bsWinCount++; else asWinCount++;
			i++;
		}
		if(asWinCount>bsWinCount) System.out.println("A");
		else System.out.println("B");
	}
}