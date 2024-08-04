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
public class ReorderList {
    public void reorderList(ListNode head) {
        Deque<Integer> dq = new ArrayDeque<>();
        ListNode temp = head.next;
        while(temp!=null){
            dq.addLast(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(!dq.isEmpty()){
            temp.next = new ListNode(dq.removeLast());
            temp = temp.next;
            if(dq.isEmpty()) break;
            temp.next = new ListNode(dq.removeFirst());
            temp = temp.next;
        }
    }
}