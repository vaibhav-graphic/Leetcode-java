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
class Problem {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        HashMap<Integer,ListNode> hm = new HashMap<>();

        hm.put(0,dummy);
        int prefix = 0;

        while(head != null){
            prefix += head.val;

            if(hm.containsKey(prefix)){
                ListNode start = hm.get(prefix);
                ListNode temp = start;
                int pSum = prefix;

                while(temp != head){
                    temp = temp.next;
                    pSum += temp.val;

                    if(temp != head){
                        hm.remove(pSum);
                    }
                }
                start.next = head.next;
            }else{
                hm.put(prefix,head);
            }
            head = head.next;
        }
        return dummy.next;
    }
}