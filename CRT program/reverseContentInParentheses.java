import java.util.*;
class Solution {
    public static String reverseParentheses(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                start = i;
            }
            if (s.charAt(i) == ')') {
                end = i;
                StringBuilder sb = new StringBuilder(s.substring(start + 1, end)).reverse();
                return reverseParentheses(s.substring(0, start) + sb.toString() + s.substring(end + 1));
            }
        }
        return s;
    }
	public static void main(String ars[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println(reverseParentheses(s.next()));
	}
}

//(ed(tdo(oc))el)-->(ed(tdoco)el)-->(edocodtel)-->letdocode