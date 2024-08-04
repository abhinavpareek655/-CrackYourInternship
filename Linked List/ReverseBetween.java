import java.util.Stack;
 // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack<Integer> stack = new Stack<>();
        int i=1;
        ListNode temp = head;
        while(i<left){
            temp = temp.next;
            i++;
        }
        ListNode ptr = temp;
        while(i<right+1){
            stack.push(ptr.val);
            ptr = ptr.next;
            i++;
        }
        while(!stack.isEmpty()){
            temp.val = stack.pop();
            temp = temp.next;
        }
        return head;
    }
}