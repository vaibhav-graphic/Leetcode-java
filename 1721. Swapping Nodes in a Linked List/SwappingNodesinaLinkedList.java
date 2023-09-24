import java.util.List;

class SwappingNodesinaLinkedList {
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

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    // leetcode function
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode first=head,second=head;

        for(int i=1;i<k;i++){
            fast=fast.next;
        }

        first=fast;

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        second=slow;

        int temp=first.val;
        first.val=second.val;
        second.val=temp;

        return head;
    }
    public static void main(String[] args) {
        SwappingNodesinaLinkedList llist = new SwappingNodesinaLinkedList();
        int k = 2;
        llist.insert(1);
        llist.insert(2);
        llist.insert(3);
        llist.insert(4);
        llist.insert(5);

        llist.swapNodes(llist.head, k);
        llist.display();
    }
}