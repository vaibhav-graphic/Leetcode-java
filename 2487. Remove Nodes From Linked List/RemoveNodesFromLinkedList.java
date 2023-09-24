class RemoveNodesFromLinkedList{
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
    
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);

        ListNode prev=head,ptr=head.next;
        int max=head.val;

        for(;ptr!=null;ptr=ptr.next){
            if(ptr.val>=max){
                max=Math.max(max,ptr.val);
                prev.next=ptr;
                prev=ptr;
            }
        }
        prev.next=null;
        head=reverse(head);
        return head;
    }

    private ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode next_ptr=null;
        ListNode previous=null;

        while(current!=null){
            next_ptr=current.next;
            current.next=previous;
            previous=current;
            current=next_ptr;
        }
        return previous;
    }

    public static void main(String[] args) {
        RemoveNodesFromLinkedList llist=new RemoveNodesFromLinkedList();
        llist.insert(5);
        llist.insert(2);
        llist.insert(13);
        llist.insert(3);
        llist.insert(8);

        llist.removeNodes(llist.head);
        llist.display();
    }

}