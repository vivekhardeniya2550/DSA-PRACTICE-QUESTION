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
    public ListNode middleNode(ListNode head) {
        int c=0;
        ListNode tmp=head;
        while(tmp!=null){
            c++;
            tmp=tmp.next;
        }
        int in=c/2;
        tmp=head;
        for(int i=0;i<in;i++)
        tmp=tmp.next;
        return tmp;

        
    }
}