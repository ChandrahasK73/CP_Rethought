import java.util.*;
class Solution
{
	public static boolean lie(TreeMap<Integer,Integer>map, int a,int b)
	{
		for(int i: map.keySet())
		{
			if(i<=a && map.get(i)>=a || i<=b && map.get(i)>=b) return true;
		}
		return false;
	}
	public static void main(String args[]) throws Exception
	{
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		TreeMap<Integer,Integer> map= new TreeMap<>();
		map.put(s.nextInt(),s.nextInt());
		for(int i=1;i<n;i++)
		{
			int a= s.nextInt();
			int b= s.nextInt();
			if(!Solution.lie(map,a,b)){
				map.put(a,b);
			}
		}
		System.out.println(map);
		System.out.println(map.size());
	}
}