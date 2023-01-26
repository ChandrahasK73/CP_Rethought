import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		LinkedList<Integer> l=new LinkedList<>();
		for(int i=0;i<n;i++) l.add(s.nextInt());
		int k=s.nextInt();
		while(k--!=0)
		{
			for(int i=0;i<l.size();i++)
			{
				if((Integer)l.get(i)<(Integer)l.get(i+1))
				{
					l.remove(i);break;
				}
			}
		}
		for(int i=0;i<l.size();i++)System.out.print(l.get(i)+" ");
	}
}