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
        
        if (head == null) return null;

        if (head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
        }
        return head;
      //if current node is not unique, return deleteDulicates(head.next)
      //if current node is unique, link the current node with recurrentive call of deleteDuplicates
      
      /*  
      if(head == null || head.next == null)
              return head;
         
        ListNode fakeHead = new ListNode(Integer.MIN_VALUE);
        fakeHead.next = head;
        
        ListNode pre = fakeHead;
        ListNode realPre = fakeHead;
        ListNode curr = head;
        ListNode next = curr.next;
        
        while(next != null){
            if(curr.val != realPre.val && curr.val != next.val){
                //current value is a unique value
                pre.next = curr;
                pre = pre.next;
                
            }
            
            //No matter if current value is unique, move realPre, curr, next to the next position
            realPre = realPre.next;
            curr = curr.next;
            next = next.next;
            
        }
        
        pre.next = null;//Deal with the last node, no matter if last values are same or not.
        if(curr.val !=realPre.val){
            //Last two values are different
            //Without this if statement, we will lose the last unique node
            pre.next = curr;
        }
        return fakeHead.next;
        */
    }
}