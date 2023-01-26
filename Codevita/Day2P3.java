import java.io.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int zc=0;
		int oc=0;
		for(char ch: br.readLine().trim().toCharArray())
		{
			if(ch=='z') zc++;
			else if(ch=='n') oc++;
		}
		for(int i=0;i<oc;i++) System.out.print(1+"");
		for(int i=0;i<zc;i++) System.out.print(0+"");
	}
}