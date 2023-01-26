import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		LinkedList l=new LinkedList();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=s.nextInt();
			if(a==1)
				l.add(s.nextInt());
			else
			{
				if(l.size()<a){
					System.out.println(-1);
					System.exit(0);}
				else
				{
					for(int j=0;j<a;j++)
					{
						l.pop();
					}
				}

			}
		}
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			System.out.print(ltr.next());
		}
	}
}