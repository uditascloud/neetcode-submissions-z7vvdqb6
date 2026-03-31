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
        ListNode fast=head;
        ListNode slow=fast;
        ListNode prev=null;
        while(n!=0){
            fast=fast.next;
            n--;
        }
        if(fast==null) {
            ListNode currHead=head;
            head=head.next;
            currHead.next=null;
            return head;
        }
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=slow.next;
        slow.next=null;
        return head;
    }
}
