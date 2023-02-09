import java.util.*;
//Definition for singly-linked list.
 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        while(list1!=null){
            list.add((int)list1.val);
            list1 = list1.next;
        } 
        while(list2!=null){
            list.add((int)list2.val);
            list2 = list2.next;
        }
        Collections.sort(list);
        Iterator<Integer> ltr= list.iterator();
        while(ltr.hasNext())
        System.out.println(ltr.next()+" ");
        System.out.println(list.size()+" ");
        if(list.size()==0) return list1;
        ltr= list.iterator();
        ListNode ln = new ListNode(ltr.next());
        ListNode head = ln;
        while(ltr.hasNext()){
            ln.next = new ListNode(ltr.next());
            ln = ln.next;
        }
        return head;
    }
}