import java.io.*;
import java.util.*;
class LongestPalindrome
{
	public static String LongestPalindrome(String str)
	{
		String ans=str.charAt(0)+"";int max=1;
		for(int i=0;i<str.length();i++)
		{
			for(int j=str.length();j>=i;j--)
			{
				if(str.substring(i,j).compareTo(new StringBuilder(str.substring(i,j)).reverse().toString())==0 && j-i>max)
				{
					max=j-i;
					ans=str.substring(i,j);
				}
			}
		}
		return ans;
	}
	public static void main(String args[])throws java.io.IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine().trim();
		System.out.println(LongestPalindrome(str));
	}
}