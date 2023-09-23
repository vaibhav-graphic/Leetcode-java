class MaximumTwinSumofaLinkedList{
    class ListNode{
        int val;
        ListNode next;

        ListNode(int d){
            val=d;
            next=null;
        }
    }

    ListNode head;

    public void insert(int newData){
        ListNode newNode=new ListNode(newData);

        if(head==null){
            head=new ListNode(newData);
            return;
        }
        newNode.next=null;

        newNode.next=head;
        head=newNode;
        return;
    }

    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.val+" ");
            current=current.next;
        }
    }

    //leetcode function 
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int maxVal = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode nextNode, prev = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        while (prev != null) {
            maxVal = Math.max(maxVal, head.val + prev.val);
            prev = prev.next;
            head = head.next;
        }

        return maxVal;
    }
    public static void main(String[] args) {
        MaximumTwinSumofaLinkedList ll=new MaximumTwinSumofaLinkedList();
        ll.insert(5);
        ll.insert(4);
        ll.insert(2);
        ll.insert(1);
        int res=ll.pairSum(ll.head);
        System.out.println(res);
    }
}