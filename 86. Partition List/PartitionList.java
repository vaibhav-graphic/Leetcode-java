class PartitonList{
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
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode(0);
        ListNode right=new ListNode(0);

        ListNode l=left;
        ListNode r=right;

        while(head!=null){
            if(head.val<x){
                l.next=head;
                l=l.next;
            }else{
                r.next=head;
                r=r.next;
            }
            head=head.next;
        }
        l.next=right.next;
        r.next=null;

        return left.next;
    }

    public static void main(String[] args){
        PartitonList llist=new PartitonList();
        llist.insert(1);
        llist.insert(4);
        llist.insert(3);
        llist.insert(2);
        llist.insert(5);
        llist.insert(2);
        int x=3;
        llist.head=llist.partition(llist.head, x);
        llist.display();
    }
}