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
    ListNode findMiddle(ListNode head){
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
           
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
     public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
     
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null)return;
        ListNode first=head;
        ListNode mid=findMiddle(first);
        ListNode second=reverseList(mid.next);
        mid.next=null;
        while(second!=null){
            ListNode fn=first.next;
            first.next=second;
            ListNode sn=second.next;
            second.next=fn;
            first=fn;
            second=sn;
        }
        
    }
}
