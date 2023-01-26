import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Iterator;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		PriorityQueue<Integer> pq=new PriorityQueue();
		int[] a=new int[n];
		for(int i=0;i<n;i++) a[i]=s.nextInt();
		for(int i=0;i<k+1;i++) pq.add(a[i]);
		int j=0;
		for(int i=k+1;i<n;i++)
		{
			a[j++]=pq.peek();
			pq.poll();
			pq.add(a[i]);
		}
		Iterator ltr=pq.iterator();
		while(ltr.hasNext()) {a[j++]=(Integer)ltr.next(); }
		for(int i=0;i<n;i++) System.out.print(a[i]+" ");
	}
}