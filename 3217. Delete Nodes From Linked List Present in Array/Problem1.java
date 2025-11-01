class Problem {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = head;
        ListNode ptr = dummy;
        dummy.next = head;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add( num );
        }

        while(temp != null){
            int data = temp.val;

            if(set.contains(data)){
                temp = temp.next;
                continue;
            }

            ptr.next = temp;
            ptr = ptr.next;
            temp = temp.next;
        }
        ptr.next = null;

        return dummy.next;
    }
}