import java.util.Scanner;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(s.nextInt()==0) count++;
		}
		for(int i=0;i<n;i++)
		{
			if(i<count)
				System.out.print("0 ");
			else 
				System.out.print("1 ");
		}
	}
}