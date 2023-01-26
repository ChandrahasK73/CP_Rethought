import java.util.Scanner;
class Solution
{
	public static int waterTrap(int[] a,int n)
	{
		int[] leftMaxArr=new int[n];
		int[] rightMaxArr=new int[n];
		leftMaxArr[0]=a[0];
		for(int i=1;i<n;i++) leftMaxArr[i]=Math.max(a[i],leftMaxArr[i-1]);
		rightMaxArr[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--) rightMaxArr[i]=Math.max(a[i],rightMaxArr[i+1]);
		int ans=0;
		for(int i=0;i<n;i++) ans+=Math.min(leftMaxArr[i],rightMaxArr[i])-a[i];
		return ans;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{
			int n=s.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++) a[i]=s.nextInt();
			System.out.println(Solution.waterTrap(a,n));
		}
	}
}