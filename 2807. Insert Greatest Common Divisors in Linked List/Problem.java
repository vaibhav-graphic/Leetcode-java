class Problem {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null){
            return head;
        }

        ListNode curr = head.next;
        ListNode prev = head;

        while(curr != null && prev != null){
            int data = gcf(curr.val, prev.val);

            ListNode node = new ListNode(data);

            prev.next = node;
            node.next = curr;
            curr = curr.next;
            prev = node.next;
        }

        return head;
    }

    private int gcf(int data1, int data2){
        int run = data1 >= data2 ? data1 : data2;
        int divisor = 1;

        for(int i=run; i>=1; i--){
            if(data1 % i == 0 && data2 % i == 0){
                divisor = Math.max(divisor, i);
            }
        }

        return divisor;
    }
}