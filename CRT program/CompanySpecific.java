import java.util.*;
class ReachLast
{
	public static boolean isLastReachable(int arr[])
	{
		if(arr.length<=1) return true;
		int jumpCounter=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1) return true;

			int jump=Math.max(jumpCounter, arr[i]);
			if(jump==0) return false;
			else
			{
				jumpCounter=jump-1;
			}
		}
		return false;
	}
}
class UniqueElements
{
	public static int countUniqueElements(int[] arr)
	{
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) h.add(arr[i]);
		return h.size();
	}
}
class SubArrayWithZero
{
	public static boolean isSubArrayWithZeroSum(int[] arr)
	{
		int sum=0;
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(set.contains(sum) || arr[i]==0 || sum==0) return true;
			set.add(sum);
		}
		return false;
	}
}
class MainMethod
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		System.out.println(ReachLast.isLastReachable(arr));
		System.out.println(UniqueElements.countUniqueElements(arr));
		System.out.println(SubArrayWithZero.isSubArrayWithZeroSum(arr));
	}
}