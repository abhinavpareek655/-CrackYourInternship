/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> hash = new HashMap<>();
        ListNode current = head;
        while(current!=null){
            if(hash.containsKey(current)){
                return true;
            }
            hash.put(current, 1);
            current = current.next;
        }
        return false;
    }
}
