import java.util.Scanner;
class Solution
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] freq= new int[2];
		for(int i=0;i<n;i++) freq[s.nextInt()]++;
		if(freq[1]==n) System.out.println("1");
		else System.out.println("0");
	}
}