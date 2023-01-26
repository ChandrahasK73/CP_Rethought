import java.io.*;
import java.util.*;
class ArmstrongNumber
{
	public static boolean isArmstrongNumber(int num, int n)
	{
		int m= num;
		int sum=0;
		while(m>0)
		{
			sum+=Math.pow(m%10,n);
			m/=10;
		}
		return sum==num;
	}
	public static void main(String args[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine().trim();
		int n= str.length();
		int num= Integer.parseInt(str);
		if(isArmstrongNumber(num,n))
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}
}