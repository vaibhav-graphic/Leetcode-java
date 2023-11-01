class Approch_2 {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;

        while(temp!=null){
            Node newNode=new Node(temp.val);
            map.put(temp,newNode);
            temp=temp.next;
        }

        Node t=head;

        while(t!=null){
            Node node=map.get(t);
            node.next=(t.next!=null)?map.get(t.next):null;
            node.random=(t.random!=null)?map.get(t.random):null;
            t=t.next;
        }

        return map.get(head);
    }
}