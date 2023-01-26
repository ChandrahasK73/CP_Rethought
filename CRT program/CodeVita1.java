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
		return false;
	}
	public static boolean isSumEquals(int sum,int n){return sum==n;}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		if(n<=4){System.out.println(count);System.exit(1);}
		else
		{
			for(int i=5;i<=n;i++)
			{
				if(isPrime(i))
				{	int sum=0;
					for(int j=2;j<i;j++)
					{
						if(isPrime(j)) {
							sum=sum+j;
							if(isSumEquals(sum,i)){count++;break;}
						}
					}
					 
				}
			}
			System.out.println(count);
		}
		
	}
}
