class Queue {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    Queue() {
        front = null;
        rear = null;
    }

    void enqueue(int data) {

        Node newNode = new Node(data);

        if (rear == null) {

            front = rear = newNode;

            return;
        }

        rear.next = newNode;

        rear = newNode;
    }

    int dequeue() {

        if (front == null) {

            System.out.println("Queue Empty");

            return -1;
        }

        int data = front.data;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    int peek() {

        if (front == null) {

            System.out.println("Queue Empty");

            return -1;
        }

        return front.data;
    }

    boolean isEmpty() {

        return front == null;
    }
}