import java.util.Scanner;
class Solution
{
	public static int fact(int n)
	{
		if(n<2) return n;
		else return n*fact(n-1);
	}
	
	public static int case1(int oddNumbers,int evenNumbers)
	{
		if(oddNumbers==2) return evenNumbers;
		else return (fact(oddNumbers)/(fact(oddNumbers-2)*2))*evenNumbers;
	}

	public static int case2(int n,int r)
	{
		if(n==r) return 1;
		else return fact(n)/(fact(n-r)*fact(r));
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int oddNumbers=0;
		int evenNumbers=0;
		if(n%2==0)
		{
			evenNumbers=n/2;oddNumbers=n/2;
		}
		else
		{
			evenNumbers=n/2;oddNumbers=n/2+1;
		}
		//there are only 2 possibilities to get an even sum out of three chosen numbers.
		// One even number + Two odd numbers.
		// All even numbers.
		System.out.println(case1(oddNumbers,evenNumbers)+case2(evenNumbers,3));
	}

}