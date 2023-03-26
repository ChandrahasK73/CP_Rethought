// Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

// Example 1:


// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

// Input: head = [1], n = 1
// Output: []

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count =0;
        if(temp!=null) count =1;
        if(temp.next==null && n==1) return null;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        temp = head;
        int val = count-n;
        if(val==0) head = head.next;
        ListNode prev = null;
        while(val--!=0){
            prev = temp;
            temp = temp.next;
        }
        if(temp!=null && prev!=null){
            prev.next = temp.next;
            temp.next = null;
        }
        //System.out.println(temp.val);
        //System.out.println(prev.val);
        return head;
    }
}