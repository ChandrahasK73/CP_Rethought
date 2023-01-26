import java.io.*;
import java.util.*;
class RainWater
{
	public static int maxWaterTrap(int[] a, int n)
	{
		int[] rightMax= new int[n];
		rightMax[0]= a[0];
		for(int i=1;i<n;i++)
		{
			rightMax[i]= Math.max(a[i],rightMax[i-1]);
		}
		int[] leftMax= new int[n];
		leftMax[n-1]= a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			leftMax[i]= Math.max(a[i],leftMax[i+1]);
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=Math.min(leftMax[i],rightMax[i])-a[i];
		}
		return sum;
	}
	public static void main(String args[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine().trim());
		StringTokenizer st= new StringTokenizer(br.readLine().trim());
		int[] a= new int[n];
		for(int i=0;i<n;i++) a[i]= Integer.parseInt(st.nextToken());
		System.out.println(maxWaterTrap(a,n));
	}
}