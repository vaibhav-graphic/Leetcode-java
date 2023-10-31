/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        //middle of linked 
        ListNode ptr=head;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            ptr=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        ptr.next=null;

        //recursive call 
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);

        //merge
        return merge(l1,l2);
    }

    private ListNode merge(ListNode head1,ListNode head2){
        ListNode fh=null,ft=null;

        while(head1!=null && head2!=null){
            if(fh==null && ft==null){
                if(head1.val>head2.val){
                    fh=head2;
                    ft=head2;
                    head2=head2.next;
                }else{
                    fh=head1;
                    ft=head1;
                    head1=head1.next;
                }
            }
            if(head1!=null && head2!=null){
                if(head1.val<head2.val){
                    ft.next=head1;
                    head1=head1.next;
                    ft=ft.next;
                }else{
                    ft.next=head2;
                    head2=head2.next;
                    ft=ft.next;
                }
            }
        }
        if(head1!=null){
            ft.next=head1;
        }

        if(head2!=null){
            ft.next=head2;
        }

        return fh;
    }

    //main function
    publid static void main(String[] args){
        
    }
}