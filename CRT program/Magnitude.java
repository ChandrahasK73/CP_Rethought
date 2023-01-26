import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		LinkedList l=new LinkedList<>();
		int n=s.nextInt();
		for(int i=0;i<n;i++) l.add(s.nextInt());
		Collections.sort(l);
		System.out.println(l);
	}
}