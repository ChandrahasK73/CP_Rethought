import java.util.Scanner;
class Solution
{
	public static int safePosition(int n,int k)
	{
		if(n==1) return 0;
		else return (safePosition(n-1,k)+k)%n;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(safePosition(n,k));
	}
}