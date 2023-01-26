import java.util.Scanner;
class Solution
{
	public static boolean isFactor(int n,int k){
		return n%k==0;
	}
	public static boolean isPrime(int n){
		if(n<2) return false;
		for(int i=2;i<n;i++) if(n%i==0) return false;
		return true;
	}
	public static int kthPrimeNumber(int n,int k)
	{
		int count=0;
		for(int i=2;i<n;i++){
			if(isFactor(n,i)){
				if(isPrime(i)){
					count++;
					if(count==k) return i;
				}
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{
			int n=s.nextInt();
			int k=s.nextInt();
			System.out.println(Solution.kthPrimeNumber(n,k));
		}
	}
}