public class RemoveDuplicatesfromSortedList {
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

    //leetcode finction
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode temp=head;

        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        temp=head;
        return temp;
    }
    public static void main(String [] args){
        RemoveDuplicatesfromSortedList llist=new RemoveDuplicatesfromSortedList();
        llist.insert(1);
        llist.insert(2);
        llist.insert(3);
        llist.insert(3);
        llist.insert(6);
        llist.insert(6);
        llist.head=llist.deleteDuplicates(llist.head);
        llist.display();
    }
}
