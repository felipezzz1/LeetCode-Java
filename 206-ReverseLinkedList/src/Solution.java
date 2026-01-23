class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode new_list = null;

        while (head != null) {
            ListNode next_node = head.next;
            head.next = new_list;
            new_list = head;
            head = next_node;
        }

        return new_list;
    }
}