import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Lcm
{
	public static void main(String args[]) throws java.io.IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two integers");
		StringTokenizer st= new StringTokenizer(br.readLine());
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		if(a<b){int temp= a; a= b; b= temp;}
		int i=1;
		while((a*i)%b!=0){
			i++;
		}
		System.out.printf("LCM of %d and %d is : %d\n",a,b,a*i);
	}
}