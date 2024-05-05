class Problem {
    public void deleteNode(ListNode node) {
        int data = node.next.val;
        node.val = data;
        node.next = node.next.next;
    }
}