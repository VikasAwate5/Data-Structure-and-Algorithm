package src.linklist;

public class ReverseSinglyLinkList {
    static ListNode head;

    static class ListNode {
        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        int data;
        ListNode next;
    }

    public static void displayLinkList() {
        if (head != null) {
            ListNode current = head;

            while (current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println(" null");
        } else {
            System.out.println("LinkList is not created.");
        }
    }

    static ListNode reverse() {
        if (head != null) {
            ListNode current = head;
            ListNode previous = null;
            ListNode next;

            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            return previous;

        } else {
            System.out.println("LinkList is not created.");
            return null;
        }
    }

    public static void main(String[] args) {
        head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        head.next = second;  //  10 --> 20 --> null
        second.next = third; //  10 --> 20 --> 30 --> null
        third.next = fourth; //  10 --> 20 --> 30 --> 40 --> null

        displayLinkList();

        head = reverse();

        displayLinkList();

    }
}
