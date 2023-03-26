/*
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 */

 class Solution {
    public int maxArea(int[] a) {
        int n =a.length;
        int max = Integer.MIN_VALUE;
        int temp;
        int i =0, j= n-1;
        while(i<j){
            temp = a[i]<a[j]?a[i]:a[j];
            temp = (j-i)*temp;
            max = Math.max(max, temp);
            if(a[i]<a[j]) i++;
            else j--;
        }
        return max;
    }
}