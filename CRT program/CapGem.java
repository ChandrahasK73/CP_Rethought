import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{
			int sum1=0;int sum2=0;
			int n=s.nextInt();
			LinkedList<Integer> l=new LinkedList<>();
			for(int i=0;i<n;i++)l.add(s.nextInt());
			int m=s.nextInt();
			LinkedList<Integer> ll=new LinkedList<>();
			for(int i=0;i<m;i++)ll.add(s.nextInt());
			for(int i=0;i<n;i++)sum1=sum1*10+(Integer)l.get(i);
			for(int i=0;i<m;i++)sum2=sum2*10+(Integer)ll.get(i);
			int sum=sum1+sum2;
			while(sum>0)
			{
				int rem=sum%10;
				sum=sum/10;
				System.out.print(rem+" ");
			}
			System.out.println();
		}
	}
}