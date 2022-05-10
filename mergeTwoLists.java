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
    ListNode head = new ListNode();
    ListNode curr = new ListNode();
    int iterCount = 0;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        //should it be done like this? Probably not, no. Did I do it anyway? Yes.
        if(iterCount == 0 && list1.val >= list2.val){
            head = new ListNode(list1.val, list1.next);
            curr = head.next;
            iterCount++;
            mergeTwoLists(list1.next, list2);
        } else if (iterCount == 0 && list1.val < list2.val){
            head = new ListNode(list2.val, list2.next);
            curr = head.next;
            iterCount++;
            mergeTwoLists(list1, list2.next);
        }
        
        if(list1 == null && list2 == null){
            return head;
        } else if (list1.val >= list2.val){
            curr = list1;
            curr.next = mergeTwoLists(list1.next, list2);
        } else if (list1.val < list2.val){
            curr = list2;
            curr.next = mergeTwoLists(list1, list2.next);
        }
        return head;
    }
}
