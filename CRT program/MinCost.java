import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)al.add(s.nextInt());
		int sum1=0;
		while(al.size()!=1)
		{
			Collections.sort(al);
			int sum=al.remove(0)+al.remove(0);
			sum1+=sum;
			al.add(sum);
		}
		
		//System.out.println(al);
		System.out.println(sum1);
	}
}