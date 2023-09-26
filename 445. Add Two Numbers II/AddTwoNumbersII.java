import java.util.Stack;

public class AddTwoNumbersII {
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

    public void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    // leetcode code function

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (l1 != null) {
            stack1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.add(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode result = null;

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int a = 0, b = 0;
            if (!stack1.isEmpty()) {
                a = stack1.pop();
            }
            if (!stack2.isEmpty()) {
                b = stack2.pop();
            }

            int total = carry + a + b;
            ListNode temp = new ListNode(total % 10);
            carry = total / 10;

            if (result == null) {
                result = temp;
            } else {
                temp.next = result;
                result = temp;
            }
        }
        // edge case
        if (carry != 0) {
            ListNode temp = new ListNode(carry);
            temp.next = result;
            result = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        AddTwoNumbersII llist = new AddTwoNumbersII();
        AddTwoNumbersII llist1 = new AddTwoNumbersII();

        llist.insert(1);
        llist.insert(2);
        llist.insert(3);
        llist.insert(4);
        llist.insert(5);
        llist.insert(6);

        llist1.insert(1);
        llist1.insert(2);
        llist1.insert(3);
        llist1.insert(4);
        llist1.insert(5);
        llist1.insert(6);

        llist.head=llist.addTwoNumbers(llist.head,llist1.head);
        llist1.display(llist.head);

    }
}
