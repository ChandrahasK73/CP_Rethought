import java.util.HashMap;
/*Given a string s, find the length of the longest 
substring
 without repeating characters. */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int left=0, right=0;
        int res= 0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                left= Math.max(map.get(s.charAt(right))+1, left);
            }
            map.put(s.charAt(right), right);
            res= Math.max(res, right-left+1);
            right++;
        }
        return res;
    }
}