import java.io.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String u= br.readLine().trim();
		String v= br.readLine().trim();
		int dp[][]= new int[u.length()+1][v.length()+1];
		for(int i=0;i<=u.length();i++)
		{
			for(int j=0;j<=v.length();j++)
			{
				if(i==0) dp[i][j]= j;
				else if(j==0) dp[i][j]= i;
				else if(u.charAt(i-1)==v.charAt(j-1)) dp[i][j]= dp[i-1][j-1];
				else dp[i][j]= 1+Math.min(dp[i-1][j], Math.min(dp[i-1][j-1],dp[i][j-1]));
			}
		}
		System.out.println(dp[u.length()][v.length()]);
	}
}