import java.util.Scanner;
class Solution
{
	public static int noOfWays(int m,int n)
	{
		int[][] ways=new int[m][n];
		for(int i=0;i<m;i++) ways[i][0]=1;
		for(int i=0;i<n;i++) ways[0][i]=1;
		for(int i=1;i<m;i++) for(int j=1;j<n;j++) ways[i][j]=ways[i-1][j]+ways[i][j-1];
		return ways[m-1][n-1];
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		System.out.println(Solution.noOfWays(m,n));
	}
}