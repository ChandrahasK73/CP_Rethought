import java.util.Scanner;
class Solution
{
	public static int gcd(int max,int min)
	{
		while(max>=min)
		{
			if(max==min) return max;
			if(max-min>min)max=max-min;
			else {int temp=max;max=min;min=temp-min;}
		}
		return 1;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();int n=s.nextInt();
		if(m<n)
		{
			int temp=m;
			m=n;
			n=temp;
		}
		System.out.println(gcd(m,n));
	}
}