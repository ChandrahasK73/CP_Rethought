import java.io.*;
import java.util.*;
class Palindrome
{
	public static boolean isPalindrome(String str)
	{
		return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	}
	public static void main(String args[])throws java.io.IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		if(isPalindrome(br.readLine().trim()))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
}