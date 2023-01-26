import java.util.Scanner;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum1=0,sum2=0;
		for(int i=0;i<n;i++)
		{
			if(i<n/2) sum1=sum1+s.nextInt();
			else sum2=sum2+s.nextInt();
		}
		System.out.println(Math.abs(sum1-sum2));
	}
}