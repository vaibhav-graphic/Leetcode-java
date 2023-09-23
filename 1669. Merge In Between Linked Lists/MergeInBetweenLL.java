class MergeInBetweenLL{
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

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p1=list1;
        ListNode p2=list1;
        ListNode prevp1=p1;

        while(a!=0){
            prevp1=p1;
            p1=p1.next;
            a--;
        }

        while(b!=0){
            p2=p2.next;
            b--;
        }
        p2=p2.next;
        ListNode p3=list2;

        while(p3.next!=null){
            p3=p3.next;
        }

        prevp1.next=list2;
        p3.next=p2;

        return list1;
    }

    public static void main(String [] args){
        MergeInBetweenLL llist=new MergeInBetweenLL();
        llist.insert(0);
        llist.insert(1);
        llist.insert(2);
        llist.insert(3);
        llist.insert(4);
        llist.insert(5);
        llist.insert(6);

        MergeInBetweenLL llist2=new MergeInBetweenLL();
        llist2.insert(1001);
        llist2.insert(1002);
        llist2.insert(1003);
        llist2.insert(1004);

        llist.mergeInBetween(llist.head, 2, 5, llist2.head);
        llist.display();
    }
}