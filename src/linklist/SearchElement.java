package src.linklist;

public class SearchElement {

    ListNode head;

    static class ListNode {
        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        int data;
        ListNode next;
    }

    public boolean search(int data) {
        if (head != null) {
            ListNode current = head;
            while (current != null) {
                if (current.data == data) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        SearchElement searchElement = new SearchElement();
        searchElement.head = new ListNode(10);

        ListNode second = new ListNode(20);
        searchElement.head.next = second;

        ListNode third = new ListNode(30);
        second.next = third;

        ListNode fourth = new ListNode(40);
        third.next = fourth;

        boolean result = searchElement.search(50);
        if (result) {
            System.out.println("Element is present. :)");
        } else {
            System.out.println("Element is not present. :(");
        }
    }

}
