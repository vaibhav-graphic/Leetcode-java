class Problem {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        while (head != null) {
            int sum = 0;
            if (head.next != null && head.val != 0) {
                while (head.next != null && head.val != 0) {
                    sum += head.val;
                    head = head.next;
                }
                ListNode newNode = new ListNode(sum);
                prev.next = newNode;
                prev = prev.next;
            }
            head = head.next;
        }

        return dummy.next;
    }
}