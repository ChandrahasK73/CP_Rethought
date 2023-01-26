import java.io.*;
import java.util.*;
class Leap
{
	public static boolean isLeap(int n){
		if(n%400==0) return true;
		if(n%100==0) return false;
		if(n%4==0) return true;
		return false;
	}
	public static void main(String args[])throws java.io.IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine().trim());
		if(isLeap(n)){
			System.out.println(n+": Leap Year");
		}
		else{
			System.out.println(n+": Non-Leap year");
		}

	}
}