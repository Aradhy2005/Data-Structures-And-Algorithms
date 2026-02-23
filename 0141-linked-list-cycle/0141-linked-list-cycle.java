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
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> st=new HashSet<>();

        while(head!=null)
        {
            if(!st.contains(head)){
            st.add(head);
            head=head.next;
            }

            else
            return true;
        }
        
        return false;
    }
}