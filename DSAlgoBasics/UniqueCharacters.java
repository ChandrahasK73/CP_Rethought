import java.io.*;
import java.util.*;
class UniqueCharacters
{
	public static int uniqueLength(String s)
	{
		int maxLen=0;
		int start=0;
		HashMap<Character,Integer> map=  new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
				start= Math.max(start,map.get(s.charAt(i))+1);
			map.put(s.charAt(i),i);
			maxLen=Math.max(maxLen,i-start+1);
		}
		return maxLen;
	}
	public static void main(String args[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine().trim();
		System.out.println(uniqueLength(str));
	}
}