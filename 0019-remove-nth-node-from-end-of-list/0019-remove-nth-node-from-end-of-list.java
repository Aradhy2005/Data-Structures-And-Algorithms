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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int l=0;
        ListNode temp=head;
        while(temp!=null)
        {
            l++;
            temp=temp.next;   // Length Calculation
        }

        if(n==l)
        {
            return head.next;
        }

        int travel=l-n;

        ListNode temp1=head;
        ListNode prev=null;

        while(travel!=0)
        {
            prev=temp1;
            temp1=temp1.next;
            travel--;
        }

        prev.next=temp1.next;

        return head;
        
    }
}