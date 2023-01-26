import java.util.*;
class PureNumbers
{
	public static void printPureNumbers(int n)
	{
		LinkedList<String> l=new LinkedList<String>();
		PriorityQueue<Integer> ans=new PriorityQueue<Integer>();
		l.addLast("44");
		l.addLast("55");
		while(ans.size()<n)
		{
			String str=l.removeFirst();
			ans.add(Integer.parseInt(str));
			l.addLast("4"+str+"4");
			l.addLast("5"+str+"5");
		}
		for(int i=0;i<n;i++)
			System.out.print(ans.remove()+" ");
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		PureNumbers.printPureNumbers(s.nextInt());
	}
}