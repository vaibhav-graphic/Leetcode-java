public class OddEvenLinkedList {
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

    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return head;
        ListNode odd=head;
        ListNode oddhead=head;
        ListNode even=head.next;
        ListNode evenhead=head.next;

        while(odd!=null && odd.next!=null && even!=null && even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenhead;
        return oddhead;
    }
    public static void main(String [] args){
        OddEvenLinkedList llist=new OddEvenLinkedList();
        llist.insert(1);
        llist.insert(2);
        llist.insert(3);
        llist.insert(4);
        llist.insert(5);
        llist.insert(6);
        llist.oddEvenList(llist.head);
        llist.display();
    }
}
