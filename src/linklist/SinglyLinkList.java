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

    private void insertAtStart(ListNode newNode) {
        newNode.next = head;
        head = newNode;
    }

    private void insertAtLast(ListNode newNode) {
        ListNode current = head;
        if (current == null) {
            head = newNode;
            return;
        }

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
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

        //Printing linkList
        sl.printLinkList(sl.head);

        //calculating linkList length
        sl.lengthOfLinkList(sl.head);

        //add node at begining
        sl.insertAtStart(new ListNode(50));

        //printing linkList
        sl.printLinkList(sl.head);

        //add node at last
        sl.insertAtLast(new ListNode(60));

        //printing linkList
        sl.printLinkList(sl.head);

    }

}
