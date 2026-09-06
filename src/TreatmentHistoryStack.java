public class TreatmentHistoryStack {

    // A simple node for the stack
    private class StackNode {
        String treatment;
        StackNode next;

        StackNode(String treatment) {
            this.treatment = treatment;
            this.next = null;
        }
    }

    private StackNode top;

    public TreatmentHistoryStack() {
        top = null;
    }

    // Add a new treatment on top of the stack
    public void push(String treatment) {
        StackNode newNode = new StackNode(treatment);
        newNode.next = top;
        top = newNode;
    }

    // Remove and return the most recent treatment
    public String pop() {
        if (top == null) {
            return null; // stack is empty
        }

        String treatment = top.treatment;
        top = top.next;
        return treatment;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Show all treatments, most recent first
    public void displayHistory() {
        StackNode current = top;
        while (current != null) {
            System.out.println(current.treatment);
            current = current.next;
        }
    }
}
