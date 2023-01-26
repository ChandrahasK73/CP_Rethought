import java.util.Scanner;
class Solution
{
	public static int maxScore(int[] stoneVals, int n, int currentIndex, int multiplier,int noOfDoubleSteps)
	{
		if(currentIndex>=n) return n;
		int score=0;
		//If your current index is not '-1', then find the individual score at that place;
		if(currentIndex!=-1){score=multiplier*stoneVals[currentIndex];}
		//Individually find the scores, when moved 1 step, 2 step and 3 steps ahead.And then find max of Three.
		int val1=maxScore(stoneVals,n,currentIndex+1,1,0);
		int val2=maxScore(stoneVals,n,currentIndex+2,2,0);
		int val3=0;
		//Since double step is only allowed once.
		if(noOfDoubleSteps==0)
		val3=maxScore(stoneVals,n,currentIndex+3,3,1);
		return score+Math.max(val1,Math.max(val2,val3));
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] stoneVals=new int[n];
		for(int i=0;i<n;i++) stoneVals[i]=s.nextInt();
		//(Let's pass array, length of array, current index, multiplier value, number of double steps taken).
		System.out.println(maxScore(stoneVals,n,-1,1,0));
	}
}