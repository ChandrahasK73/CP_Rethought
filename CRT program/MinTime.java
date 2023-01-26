import java.util.Scanner;
class Solution
{
	public static int minTime(int[] timeVals,int currentIndex)
	{
		if(currentIndex>=timeVals.length) return 0;
		int score=0;
		if(currentIndex!=-1){score=timeVals[currentIndex];}
		int val1=minTime(timeVals,currentIndex+1);
		int val2=minTime(timeVals,currentIndex+2);
		return score+Math.min(val1,val2);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] timeVals=new int[n];
		for(int i=0;i<n;i++) timeVals[i]=s.nextInt();
		System.out.println(minTime(timeVals,-1));
	}
}