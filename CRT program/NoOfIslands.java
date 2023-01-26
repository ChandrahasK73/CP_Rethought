import java.util.Scanner;
class Solution
{
	public static void printMatrix(int[][] matrix)
	{
		for(int i[] : matrix)
		{
			for(int j : i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void destroyIslands(int[][] matrix,int i,int j)
	{
		if(i<0 || j<0 || i>=matrix.length || j>=matrix.length || matrix[i][j]==0) return;
		matrix[i][j]=0;
		destroyIslands(matrix,i-1,j);
		destroyIslands(matrix,i,j+1);
		destroyIslands(matrix,i+1,j);
		destroyIslands(matrix,i,j-1);

		/*
		To consider even the diagonal land
		destroyIsland(matrix, i-1, j-1);
		destroyIsland(matrix, i-1, j+1);
		destroyIsland(matrix, i+1, j+1);
		destroyIsland(matrix, i+1, j-1);

		*/
	}
	public static int noOfIslands(int[][] matrix)
	{
		int count=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(matrix[i][j]==1)
				{
					count++;
					destroyIslands(matrix,i,j);
				}
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		int matrix[][] = {
				{0, 1, 1, 1, 0, 1, 0},
				{0, 1, 1, 1, 1, 1, 0},
				{0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 1, 0, 1},
				{1, 1, 1, 0, 0, 1, 1},
				{1, 1, 0, 0, 0, 0, 1},
				{0, 1, 1, 0, 1, 0, 1}
		};
		System.out.print("No. of Islands : "+noOfIslands(matrix));
	}
}