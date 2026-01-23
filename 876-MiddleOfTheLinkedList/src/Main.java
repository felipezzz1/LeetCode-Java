public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head1 = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));

        System.out.println(solution.middleNode(head).val);

        System.out.println(solution.middleNode(head1).val);
    }
}