/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode ptr = head;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int a = (l1 != null)?l1.val:0;
            int b = (l2 != null)?l2.val:0;
            int sum = (a+b+carry)%10;
            carry = (a+b+carry)/10;
            ListNode newNode = new ListNode(sum,null);
            ptr.next = newNode;
            ptr = ptr.next;

            l1 = (l1 != null)?l1.next:null;
            l2 = (l2 != null)?l2.next:null;
        }
        return head.next;
    }
}
