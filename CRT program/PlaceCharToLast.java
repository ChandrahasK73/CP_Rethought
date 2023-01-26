import java.util.*;
class Solution
{
	public static String placeCharToLast(String str,char ch,int currentIndex,int count)
	{
		if(currentIndex==str.length())
		{
			String last="";
			for(int i=0;i<count;i++) last+=ch;
			return last;
		}
		if(str.charAt(currentIndex)==ch) return placeCharToLast(str,ch,currentIndex+1,count+1);
		else return str.charAt(currentIndex)+placeCharToLast(str,ch,currentIndex+1,count);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println(Solution.placeCharToLast(s.next(),s.next().charAt(0),0,0));
	}
}