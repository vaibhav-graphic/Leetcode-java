public class Approch_2 {
    public ListNode rotateRight(ListNode head, int k) {

        //edge case
        if(head==null || head.next==null || k==0) return head;

        //calculate the length
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }

        //fing plce where we have to rotate
        k%=count;
        k=count-k;
        temp.next=head;
        while(k>0){
            temp=temp.next;
            k--;
        }

        //new head is made 
        head=temp.next;
        temp.next=null;

        return head;
    }
}
