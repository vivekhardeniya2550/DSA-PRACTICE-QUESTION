 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Use a dummy node to handle edge cases easily (e.g., removing the head node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // Move fast pointer n + 1 steps ahead so there is a gap of n nodes between fast and slow
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // Move both pointers until fast reaches the end of the list
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // slow.next is the nth node from the end. Skip it.
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}