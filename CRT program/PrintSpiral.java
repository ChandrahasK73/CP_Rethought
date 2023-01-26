import java.util.Scanner;
class Solution
{
	public static void printMatrix(int[][] matrix)
	{
		for(int i[] : matrix)
		{
			for(int j : i)
			{
				System.out.print(j+"	");
			}
			System.out.println();
		}
	}
	public static void printSpiral(int[][] matrix, int i,int j,int count)
	{
		if(i<0 || j<0 || i>=matrix.length || j>=matrix.length || matrix[i][j]!=0) return;
		matrix[i][j]=++count;
		if(i==0 || matrix[i-1][j]!=0) printSpiral(matrix,i,j+1,count);
		printSpiral(matrix,i+1,j,count);
		printSpiral(matrix,i,j-1,count);
		printSpiral(matrix,i-1,j,count);
	}
	public static void printSpiral(int n)
	{
		int matrix[][]=new int[n][n];
		printSpiral(matrix,0,0,0);
		printMatrix(matrix);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Solution.printSpiral(n);
	}
}