package src.linklist;

public class SinglyLinkList {

    ListNode head;

    private static class ListNode {

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        int data;
        ListNode next;
    }

    private void printLinkList(ListNode current) {

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private void lengthOfLinkList(ListNode current) {
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }

        System.out.println("length of link list : " + count);
    }

    public static void main(String[] args) {
        SinglyLinkList sl = new SinglyLinkList();

        sl.head = new ListNode(10);

        ListNode first = new ListNode(20);
        sl.head.next = first;

        ListNode second = new ListNode(30);
        first.next = second;

        ListNode third = new ListNode(40);
        second.next = third;

        sl.printLinkList(sl.head);
        sl.lengthOfLinkList(sl.head);
    }

}
