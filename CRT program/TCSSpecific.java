import java.util.Scanner;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int[] a=new int[101];
		for(int i=0;i<101;i++) a[i]=i;
		int[] b=new int[101];
		int m=s.nextInt();
		while(m--!=0)
		{
			int piles=s.nextInt();
			int i=1;
			int k=1;
			while(i<=piles)
			{
				for(int j=i;j<101;j+=piles)
				{
					b[k++]=a[j];
				}
				i++;
			}
			for(int l=0;l<101;l++) a[l]=b[l];
		}
		System.out.println(b[s.nextInt()]);
	}
}