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
 
/* 
//Iterative
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;       //Could use l1 directly
        ListNode p2 = l2;
        ListNode fakeHead = new ListNode(0);    //Create a fakeHead, store the first mergerd element as fakeHead.next
        ListNode p = fakeHead;      //Return fakeHead, so create a copy to iterate
        
        while(p1 != null && p2 != null){
            if(p1.val<=p2.val){
                p.next = p1;
                p1 = p1.next;
                p = p.next;
            }else{
                p.next = p2;
                p2 = p2.next;
                p = p.next;
            }
        }
        //If p1 becomes null or it is origianlly null, append p2 to p
        if(p1 == null){ 
            p.next = p2;
        }
        //If p2 becomes null or it is originally null, append p1 to p
        if(p2 == null){
            p.next = p1;
        }
        return fakeHead.next;
    }
}
*/

//Recursive
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    
    if(l1 == null){
        return l2;
    }
    if(l2 == null){
        return l1;
    }
    
    ListNode mergeHead;
    if(l1.val <= l2.val){
        mergeHead = l1;
        mergeHead.next = mergeTwoLists(l1.next, l2);
    }
    else{
        mergeHead = l2;
        mergeHead.next = mergeTwoLists(l1, l2.next);
    }
return mergeHead;
}
}
