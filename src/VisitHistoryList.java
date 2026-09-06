public class VisitHistoryList {

    // A simple node for the linked list
    private class ListNode {
        String visitDetails;
        ListNode next;

        ListNode(String visitDetails) {
            this.visitDetails = visitDetails;
            this.next = null;
        }
    }

    private ListNode head;

    public VisitHistoryList() {
        head = null;
    }

    // Add a new visit to the end of the list
    public void addVisit(String visitDetails) {
        ListNode newNode = new ListNode(visitDetails);

        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Print all visits in order
    public void displayVisits() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.visitDetails);
            current = current.next;
        }
    }
}