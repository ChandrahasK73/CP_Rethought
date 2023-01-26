import java.util.Scanner;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int[][] a=new int[row][col];
		for(int i=0;i<row;i++) for(int j=0;j<col;j++) a[i][j]=s.nextInt();
		for(int i=0;i<row;i++)
		{
			int temp=a[i][0];
			a[i][0]=a[i][col-1];
			a[i][col-1]=temp;
		}
		System.out.println();
		for(int[] i:a)
		{
			for(int j:i) System.out.print(j+" ");
			System.out.println();
		}
	}
}