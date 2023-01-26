import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		LinkedList<Character> l=new LinkedList<Character>();
		String str=s.next();
		for(int i=0;i<n;i++) l.add(str.charAt(i));
		Collections.sort(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			System.out.print(ltr.next()+"");
		}
	}
}