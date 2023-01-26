import java.io.*;
import java.util.*;
class Fibonacci
{
	public static void main(String args[])throws java.io.IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine().trim());
		ArrayList<Integer> al= new ArrayList<>();
		al.add(0); al.add(1); int a=0; int b=1;
		int temp=a+b;
		while(temp<=n){
			al.add(temp);
			a=b; b= temp; temp=a+b;
		}
		ListIterator ltr= al.listIterator();
		while(ltr.hasNext()){
			System.out.print(ltr.next()+" ");
		}
		System.out.println();
	}
}