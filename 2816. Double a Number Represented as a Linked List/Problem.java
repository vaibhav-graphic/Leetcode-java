class Problem {
    public ListNode doubleIt(ListNode head) {
        if(head.next == null && head.val < 5){
            if(head.val == 0) return head;
            head.val *= 2;
            return head;
        }

        head = reverse(head);

        ListNode temp = head;
        int carry = 0;
        int data = 0;
        ListNode dummy = new ListNode(-1);
        ListNode dummyTemp = dummy;

        while(temp != null){
            if(carry > 0){
                data = (temp.val * 2) + carry;
                carry = 0;
            }else{
                data = temp.val * 2;
            }

            ListNode newNode = new ListNode(data % 10);
            dummyTemp.next = newNode;
            dummyTemp = dummyTemp.next;
            temp = temp.next;

            if(data < 10){
                carry = 0;
            }else{
                while(data > 0){
                carry = data;
                data /= 10;
                }
            }
        }
        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            dummyTemp.next = newNode;
            dummyTemp = dummyTemp.next;
        }

        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next_ptr = null;

        while(curr != null){
            next_ptr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next_ptr;
        }
        return prev;
    }
}