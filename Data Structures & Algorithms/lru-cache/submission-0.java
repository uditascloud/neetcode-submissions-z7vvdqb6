class LRUCache {


    class ListNode{
        int key;
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    ListNode head= new ListNode(-1,-1);
    ListNode tail=new ListNode(-1,-1);
    int capa;
    HashMap<Integer,ListNode>mp = new HashMap<>();

    void addNodeAfterHead(ListNode newNode){
        ListNode temp=head.next;
        newNode.prev=head;
        newNode.next=temp;
        head.next=newNode;
        temp.prev=newNode;

    }

    void deleteNode(ListNode delNode){
        ListNode delPrev=delNode.prev;
        ListNode delNext=delNode.next;
        delPrev.next=delNext;
        delNext.prev = delPrev;

    }

    public LRUCache(int capacity) {
        capa=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            ListNode currNode=mp.get(key);
            mp.remove(key);
            deleteNode(currNode);
            addNodeAfterHead(currNode);
            mp.put(key,currNode);
            return currNode.val;
        }return -1;
    }
    
    public void put(int key, int val) {
        if(mp.containsKey(key)){
            ListNode currNode=mp.get(key);
            deleteNode(currNode);
            mp.remove(key);
        }
        if(mp.size()==capa){
            mp.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        addNodeAfterHead(new ListNode(key,val));
        mp.put(key,head.next);
    }
}
