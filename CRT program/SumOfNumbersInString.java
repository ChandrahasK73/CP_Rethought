import java.util.Scanner;
import java.util.Arrays;
class Solution
{
	public static int[] arrayOfNumbersInString(String str,int[] a,int num,int prev,int currentIndex,int strpos)
	{
		if(strpos==str.length()) return a;
		if(str.charAt(strpos)>='0' && str.charAt(strpos)<='9')
		{
			num=Integer.parseInt(str.charAt(strpos)+"");
			prev=prev*10+num;
			arrayOfNumbersInString(str,a,num,prev,currentIndex,strpos+1);
		}
		if(str.charAt(strpos)>='a' && str.charAt(strpos)<='z' || strpos==str.length()-1)
		{
			if(strpos!=0 && str.charAt(strpos-1)>='0' && str.charAt(strpos-1)<='9')a[currentIndex]=prev;
			prev=0;
			arrayOfNumbersInString(str,a,0,0,currentIndex+1,strpos+1);
		}
		return a;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int[] a=new int[str.length()];
		int sum=0;
		a=Solution.arrayOfNumbersInString(str,a,0,0,0,0);
		for(int i:a) sum=sum+i;
		System.out.println(sum);
	}
}