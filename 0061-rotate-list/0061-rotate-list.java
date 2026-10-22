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
    public ListNode rotateRight(ListNode head, int k) {



      if(head==null || head.next == null){
        return head;
      }
        ListNode tail = head;
        int length = 1;

        while(tail.next != null) {
            length++;
            tail = tail.next;
        }

        k = k % length;

        if(k == 0) {
            return head;
        }

        tail.next = head;

        ListNode newLastNode = findNthNode(head, length - k);
        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }


    private ListNode findNthNode(ListNode head, int k){
        ListNode temp  = head;

        for(int i = 1; i<k; i++){
            temp = temp.next;
        }
        return temp;
    }
}  
    