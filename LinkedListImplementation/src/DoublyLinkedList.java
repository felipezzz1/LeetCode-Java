public class DoublyLinkedList {
    ListNode head;
    ListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToFront(DoublyLinkedList doublyLinkedList, int value){
        ListNode newNode = new ListNode(value);

        if (doublyLinkedList.head == null) {
            doublyLinkedList.head = doublyLinkedList.tail = newNode;
        } else {
            newNode.next = doublyLinkedList.head;
            doublyLinkedList.head.prev = newNode;
            doublyLinkedList.head = newNode;
        }
    }

    public void addToEnd(DoublyLinkedList doublyLinkedList, int value){
        ListNode newNode = new ListNode(value);

        if(doublyLinkedList.tail == null) {
            doublyLinkedList.tail = doublyLinkedList.head = newNode;
        } else {
            newNode.prev = doublyLinkedList.tail;
            doublyLinkedList.tail.next = newNode;
            doublyLinkedList.tail = newNode;
        }
    }

    public Integer removeFromFront(DoublyLinkedList doublyLinkedList) {
        if (doublyLinkedList.head == null) {
            return null;
        }
        int removedValue = doublyLinkedList.head.value;
        if (doublyLinkedList.head == doublyLinkedList.tail) {
            doublyLinkedList.head = doublyLinkedList.tail = null;
        } else{
            doublyLinkedList.head = doublyLinkedList.head.next;
            doublyLinkedList.head.prev = null;
        }
        return removedValue;
    }

    public Integer removeFromEnd(DoublyLinkedList doublyLinkedList) {
        if (doublyLinkedList.tail == null) {
            return null;
        }
        int removedValue = doublyLinkedList.tail.value;
        if (doublyLinkedList.head == doublyLinkedList.tail) {
            doublyLinkedList.head = doublyLinkedList.tail = null;
        } else{
            doublyLinkedList.tail = doublyLinkedList.tail.prev;
            doublyLinkedList.head.next = null;
        }
        return removedValue;
    }
}
