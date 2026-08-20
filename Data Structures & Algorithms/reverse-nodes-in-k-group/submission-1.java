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
    public ListNode reverse(ListNode currHead){
        ListNode currPointer=currHead;
        ListNode prev=null;
        while(currPointer!=null ){
            ListNode next=currPointer.next;
            currPointer.next=prev;
            prev=currPointer;
            currPointer=next;
        }
        return prev;
      
    }

    public ListNode nextkth(ListNode currNode, int k){

        while(k>1 && currNode!=null){
            currNode=currNode.next;
            k--;
        }
        return  currNode;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return head;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kthNode=nextkth(temp,k);
            if(kthNode==null){
                if(prev!=null) prev.next=temp;
                break;
        }
            ListNode nextofKth=kthNode.next;
            // prev=temp;
            kthNode.next=null;
            ListNode newHead=reverse(temp);
            if(temp==head){
                head=newHead;
            }else{
                prev.next=newHead;
            }
            temp.next=nextofKth;
            prev=temp;
            temp=nextofKth;
            
            
        }
        return head;
    }
}
