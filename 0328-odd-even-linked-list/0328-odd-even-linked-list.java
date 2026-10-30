import java.util.*;
class Solution {
    public ListNode oddEvenList(ListNode head) {
if (head == null || head.next == null) {
    return head;
}
       ListNode temp = head;
       int position = 1;

       HashMap<ListNode,Integer> map = new HashMap<>();

       while(temp!=null){

        map.put(temp,position);
        position++;
        temp = temp.next;

       }

       List<ListNode> odd = new ArrayList<>();
       List<ListNode> even = new ArrayList<>();

       temp = head;
       while(temp != null){
        int pos  = map.get(temp);

        if(pos % 2 != 0){
           odd.add(temp);
        }else{
            even.add(temp);
        }

        temp = temp.next;
       }
      for(int i = 0 ; i<odd.size()-1; i++){
        odd.get(i).next = odd.get(i+1);
      }
      for(int i=0; i<even.size()-1; i++){
        even.get(i).next = even.get(i+1);
      }
      odd.get(odd.size()-1).next = even.get(0);
     even.get(even.size() - 1).next = null;
      return odd.get(0);
    }
}