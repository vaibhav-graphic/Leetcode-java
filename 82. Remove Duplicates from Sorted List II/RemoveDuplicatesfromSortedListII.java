class RemoveDuplicatesfromSortedListII{
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy;
    
        while(head!=null){
            if(head.next!=null && head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                prev.next=head.next;
            }else{
                prev=prev.next;
            }
            head=head.next;
        } 
        return dummy.next;            
        }
    public static void main(String [] args){
        RemoveDuplicatesfromSortedListII llist=new RemoveDuplicatesfromSortedListII();
        llist.insert(1);
        llist.insert(2);
        llist.insert(3);
        llist.insert(3);
        llist.insert(4);
        llist.insert(4);
        llist.insert(5);
        llist.head=llist.deleteDuplicates(llist.head);
        llist.display();
    }
}