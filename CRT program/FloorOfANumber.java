import java.util.Scanner;
class Solution
{
	public static int Floor(int[] a,int x)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>x) return a[i-1];
		}
		return a[a.length-1];
	}
	public static int isPresent(int[] a,int x)
	{
		for(int i=0;i<a.length;i++) if(a[i]==x) return i;
		return -1;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x= s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int b=isPresent(a,x);
		if(b>0){System.out.println(a[b-1]);}
		else
		{
			if(x<a[0]){System.out.println("-1");System.exit(1);}
			else{System.out.println(Floor(a,x));}
		}
		
	}
}