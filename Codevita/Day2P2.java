import java.math.BigInteger;
import java.io.*;
import java.util.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine().trim());
		System.out.println(new BigInteger(st.nextToken()).add(new BigInteger(st.nextToken())));
	}
}