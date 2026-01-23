public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode reversed = solution.reverseList(head);

        printList(reversed);

    }

    public static void printList(ListNode head){
        ListNode current = head;

        while(current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
