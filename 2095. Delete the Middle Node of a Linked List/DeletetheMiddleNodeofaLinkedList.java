public class DeletetheMiddleNodeofaLinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int d) {
            val = d;
            next = null;
        }
    }

    ListNode head;

    public void insert(int newData) {
        // check linked list is not empty
        if (head == null) {
            head = new ListNode(newData);
            return;
        }
        // create new node
        ListNode newNode = new ListNode(newData);
        // new node next is null
        // inserti in the end
        newNode.next = null;

        // temp pointer
        ListNode temp = head;

        // travel in the linked list
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }

        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;

        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }

        prev.next=slow.next;
        return head;
    }

    public static void main(String [] args){
        DeletetheMiddleNodeofaLinkedList llist= new DeletetheMiddleNodeofaLinkedList();
        llist.insert(1);
        llist.insert(2);
        llist.insert(3);
        llist.insert(4);
        llist.insert(5);
        llist.insert(6);
        llist.head=llist.deleteMiddle(llist.head);
        llist.display();
    }
}
