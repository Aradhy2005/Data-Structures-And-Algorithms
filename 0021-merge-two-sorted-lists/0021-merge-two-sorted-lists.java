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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode curr= dummy;

        mergeHelper(list1,list2,curr);

        return dummy.next;
        
    }

    void mergeHelper(ListNode list1,ListNode list2, ListNode curr)
    {
        if(list1==null)
        {
            curr.next=list2;
            return;
        }

        if(list2==null)
        {
            curr.next=list1;
            return;
        }

        if(list1.val<list2.val)
        {
            curr.next=list1;

            mergeHelper(list1.next,list2,curr.next);
        }

        else
        {
            curr.next=list2;
            mergeHelper(list1,list2.next,curr.next);
        }

    }
}