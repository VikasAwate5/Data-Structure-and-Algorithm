package src.linklist;

public class DeleteNode {
    static ListNode headNode;

    static class ListNode {

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        int data;
        ListNode next;
    }

    static void display() {
        ListNode current = headNode;
        while (current != null) {
            System.out.print(current.data + "  --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    static void deleteFirstNode() {
        ListNode temp = headNode;
        headNode = headNode.next;
        temp.next = null;
    }

    static void deleteLastNode() {
        ListNode current = headNode;
        ListNode previous = null;

        while (current != null && current.next != null) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("LinkList not created.");
        } else if (previous == null) {
            headNode = null;
        } else {
            previous.next = null;
        }
    }

    static void deleteNodeAt(int position) {
        if (position == 1) {
            deleteFirstNode();
        } else {
            ListNode previous = headNode;

            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public static void main(String[] args) {
        headNode = new ListNode(1);

        ListNode second = new ListNode(2);
        headNode.next = second;

        ListNode third = new ListNode(3);
        second.next = third;

        ListNode fourth = new ListNode(4);
        third.next = fourth;

        ListNode fifth = new ListNode(5);
        fourth.next = fifth;

        display();

        deleteFirstNode();

        display();

        deleteLastNode();

        display();

        deleteNodeAt(2);

        display();

    }

}
