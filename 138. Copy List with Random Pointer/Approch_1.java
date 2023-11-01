class Approch_1 {
    public Node copyRandomList(Node head) {
        //we have make deep copy of the linked list
        Node temp=head;

        while(temp!=null){
            Node newNode=new Node(temp.val);
            newNode.next=temp.next;
            temp.next=newNode;
            temp=temp.next.next;
        }

        //make a connection between random in deep copy of linked list
        Node itr=head;

        while(itr!=null){
            if(itr.random!=null){
                itr.next.random=itr.random.next;
            }
            itr=itr.next.next;
        }

        //sperste both the linked list

        Node dummy=new Node(0);
        itr=head;
        temp=dummy;
        Node fast;

        while(itr!=null){
            fast=itr.next.next;
            temp.next=itr.next;
            itr.next=fast;
            temp=temp.next;
            itr=fast;
        }
        return dummy.next;
    }
}