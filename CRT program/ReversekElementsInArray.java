import java.util.Scanner;
import java.util.Arrays;
class Solution
{
	public static int[] reverseKElements(int[] a,int[] b,int n,int index,int prevIndex,int currentIndex,int k)
	{
		if(currentIndex>=n-1)
		{
			for(int i=n-1;i>prevIndex;i--) b[index++]=a[i];
			return b;
		}
		if(currentIndex!=-1)
		{
			for(int i=currentIndex;i>prevIndex;i--) b[index++]=a[i];
		}
		reverseKElements(a,b,n,index,currentIndex,currentIndex+k,k);
		return b;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++) a[i]=s.nextInt();
		System.out.println(Arrays.toString(reverseKElements(a,b,n,0,-1,-1,k)));
	}
}