//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Solution solution = new Solution();

            ListNode head = new ListNode(4,
                    new ListNode(2,
                    new ListNode(1,
                    new ListNode(3))));

            ListNode sorted = solution.sortList(head);

            while (sorted != null) {
                System.out.println(sorted.val + " ");
                sorted = sorted.next;
        }
    }
}