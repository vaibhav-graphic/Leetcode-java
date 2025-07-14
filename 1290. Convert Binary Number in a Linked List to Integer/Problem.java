class Problem {
    public int getDecimalValue(ListNode head) {
        int res=0;

        while(head!=null){
            res=res<<1;
            res+=head.val;
            head=head.next;
        }
        return res;
    }
}