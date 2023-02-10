/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 */

import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        return
            new StringTokenizer(
                new StringBuilder(s).reverse().toString())
                    .nextToken().length();
    }
}