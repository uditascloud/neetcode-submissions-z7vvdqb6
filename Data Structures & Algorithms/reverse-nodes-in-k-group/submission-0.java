class Solution {

    public ListNode findKthNode(ListNode node, int k){
        while(node != null && k > 1){
            node = node.next;
            k--;
        }
        return node;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prevNodeEnd=null;
        while(temp!=null){
            ListNode kthNode=findKthNode(temp,k);
            if(kthNode==null){
                if(prevNodeEnd!=null){
                    prevNodeEnd.next=temp;
                }
                 break;
            }
            ListNode nextNode=kthNode.next;
            kthNode.next=null;
            ListNode newHead=reverse(temp);
            if(temp==head){
                head=newHead;
            }
            else{
                prevNodeEnd.next=newHead;
            }
            prevNodeEnd=temp;
            temp=nextNode;
        }
        return head;
    }
}