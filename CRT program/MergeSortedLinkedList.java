import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		LinkedList l1=new LinkedList();
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		for(int i=0;i<n1;i++)
			l1.add(s.nextInt());
		int n2=s.nextInt();
		for(int i=0;i<n2;i++)
			l1.add(s.nextInt());
		Collections.sort(l1);
		ListIterator ltr=l1.listIterator();
		while(ltr.hasNext())
		{
			System.out.print(ltr.next()+" ");
		}
	}
}