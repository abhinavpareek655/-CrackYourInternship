class SortLinkedList{
  public ListNode sortLinkedList(ListNode head){
    int[] count = {0,0,0};
    ListNode node = head;
    while(node!=null){
      if(node.val==0)count[0]++;
      else if(node.val==1)count[1]++;
      else count[2]++;
    }
    ListNode res;
    node = res;
    while(count[0]>0){
      ListNode temp = new ListNode(0);
      node.next = temp;
      count[0]--;
    }
    while(count[1]>0){
      ListNode temp = new ListNode(1);
      node.next = temp;
      count[1]--;
    }
    while(count[2]>0){
      ListNode temp = new ListNode(2);
      node.next = temp;
      count[1]--;
    }
    return res;
  }
}
