class Solution {
    public boolean isPalindrome(int x) {
        return new StringBuilder(String.valueOf(x)).reverse().toString().
            compareTo(String.valueOf(x))==0;
    }
}