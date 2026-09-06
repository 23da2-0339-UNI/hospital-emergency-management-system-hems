public class EmergencyQueue {

    // A simple node just for the queue (separate from the BST's Node)
    private class QueueNode {
        Patient patient;
        QueueNode next;

        QueueNode(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }

    private QueueNode front;
    private QueueNode rear;

    public EmergencyQueue() {
        front = null;
        rear = null;
    }

    // Add a patient to the back of the line
    public void enqueue(Patient patient) {
        QueueNode newNode = new QueueNode(patient);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Remove and return the patient at the front of the line
    public Patient dequeue() {
        if (front == null) {
            return null; // queue is empty
        }

        Patient patient = front.patient;
        front = front.next;

        if (front == null) {
            rear = null; // queue is now empty
        }

        return patient;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // Print everyone currently waiting, in order
    public void displayQueue() {
        QueueNode current = front;
        while (current != null) {
            System.out.println(current.patient);
            current = current.next;
        }
    }
}