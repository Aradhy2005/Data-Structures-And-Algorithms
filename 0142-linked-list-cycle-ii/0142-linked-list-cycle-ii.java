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
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head==null || head.next==null)return null;

        Set<ListNode> st = new HashSet<>();

        ListNode curr = head;

        while(curr!=null)
        {
            if(st.contains(curr))
            {
                return curr;
            }

            st.add(curr);
            curr=curr.next;
        }

        return null;
        
    }
}