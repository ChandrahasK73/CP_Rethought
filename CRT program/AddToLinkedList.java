import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ListIterator ltr=ll.listIterator();
		LinkedList l=new LinkedList();
		int sum=0;
		while(ltr.hasNext())
		{
			sum=sum*10+(Integer)ltr.next();
		}
		sum=sum+1;
		Object o= (Object)sum;
		System.out.println(o);
		while(sum>0)
		{
			int rem=sum%10;
			l.addFirst((Object)rem);
			sum=sum/10;
		}
		System.out.println(l);
		ListIterator ltr1=l.listIterator();
		while(ltr1.hasNext())
		{
			System.out.print(ltr1.next()+" ");
		}
	}
}