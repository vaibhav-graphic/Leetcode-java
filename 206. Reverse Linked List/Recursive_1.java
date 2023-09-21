public class Recursive_1 {
     // Define the ListNode class here
     class ListNode {
        int val;
        ListNode next;

        ListNode(int d) {
            val = d;
            next = null;
        }
    }

    ListNode head;

    // Insert a new node at the end of the linked list
    public void insert(int newData) {
        if (head == null) {
            head = new ListNode(newData);
            return;
        }
        ListNode newNode = new ListNode(newData);
        newNode.next = null;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display the linked list
    public void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(); // Add a newline at the end
    }

    //leetcode function

    public ListNode reverseList(ListNode head){

        if(head==null || head.next==null)
            return head;

        ListNode newHead= reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;    
    }

    public static void main(String[] args) {
        Recursive_1 llist = new Recursive_1();
        llist.insert(1);
        llist.insert(2);
        llist.insert(3);
        llist.insert(4);
        llist.insert(5);

        // Update the head with the new head of the reversed list
        llist.head = llist.reverseList(llist.head);

        // Display the reversed linked list
        llist.display(llist.head);
    }
}
