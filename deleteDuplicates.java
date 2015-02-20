/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       
       //Corner case
       if(head==null || head.next==null) return head;
       
       ListNode p = head;   //Create a ListNode to iterate
       while(p.next!= null)
       {
            if(p.val == p.next.val)
            {
                p.next=p.next.next;
            }
            
            else p = p.next;
       }
        
        return head;
    }
}