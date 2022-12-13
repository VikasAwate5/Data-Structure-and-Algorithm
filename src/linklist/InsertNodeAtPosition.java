package src.linklist;

public class InsertNodeAtPosition {
    static ListNode headNode;

    static void printLinkList() {
        ListNode current = headNode;

        while (current != null) {
            System.out.print(current.data + "  -->  ");
            current = current.next;
        }
        System.out.println("null");
    }

    static void insertNodeAt(int data, int position) {
        ListNode newNode = new ListNode(data);

        if (position == 1) {
            newNode.next = headNode;
            headNode = newNode;
        } else {
            ListNode previous = headNode;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            if (previous == null) {
                System.out.println("Invalid Position");
            } else {
                ListNode nextNode = previous.next;
                previous.next = newNode;
                newNode.next = nextNode;
            }
        }
    }

    public static void main(String[] args) {

        headNode = new ListNode(1);

        ListNode second = new ListNode(2);
        headNode.next = second;

        printLinkList();

        insertNodeAt(3, 3);

        printLinkList();

        insertNodeAt(12, 2);

        printLinkList();

        insertNodeAt(10, 6);

    }
}

class ListNode {

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    int data;
    ListNode next;
}
