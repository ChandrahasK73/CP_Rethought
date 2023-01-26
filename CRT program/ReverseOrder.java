import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			l.add(s.nextInt());
		}
		LinkedList<Integer> l1=new LinkedList<Integer>();
		for(int i=0;i<n/2;i++)
			{
				l1.add(l.get(i));
				l1.add(l.get(n-i-1));
			}
		if(n%2!=0)
		l1.add(l.get(n/2));
		ListIterator ltr=l1.listIterator();
		while(ltr.hasNext())
		{
			System.out.print(ltr.next()+" ");
		}
	}
}