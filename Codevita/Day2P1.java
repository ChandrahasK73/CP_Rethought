//Print matrix diagonally
import java.io.*;
import java.util.StringTokenizer;
class Solution
{
	public static void printAntiDiagonal(int[][] a,int n)
	{
		int row=0; int col=0;
		for(int i=0;i<n;i++)
		{
			row=0; col= i;
			while(row<n && col>=0)
			{
				System.out.print(a[row][col]+" ");
				row++; col--;
			}
		}
		for(int i=1;i<n;i++)
		{
			col= n-1; row=i;
			while(row<n && col>=0)
			{
				System.out.print(a[row][col]+" ");
				row++; col--;
			}
		}
	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine().trim());
		while(t--!=0)
		{
			int n= Integer.parseInt(br.readLine().trim());
			StringTokenizer st= new StringTokenizer(br.readLine().trim());
			int[][] a= new int[n][n];
			for(int i=0;i<n;i++) for(int j=0;j<n;j++) a[i][j]= Integer.parseInt(st.nextToken());
			Solution.printAntiDiagonal(a,n);
		}
	}
}