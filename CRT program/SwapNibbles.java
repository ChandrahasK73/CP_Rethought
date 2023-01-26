import java.util.Scanner;
class Solution
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int[] a=new int[8];
		String str=Integer.toBinaryString(s.nextInt());
		int k=str.length();
		while(k<8)
		{
			str="0"+str;
			k++;
		}
		for(int i=0;i<8;i++){a[(4+i)%8]=Integer.parseInt(str.charAt(i)+"");}
		int sum=0;
		for(int i=0;i<8;i++)sum=sum+ a[i]*(int) Math.pow(2,7-i);
		System.out.println(sum);
	}
}