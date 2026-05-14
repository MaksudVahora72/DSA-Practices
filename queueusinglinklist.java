class queuenode {
    int data;
    Node next;

    queuenode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class queueusinglinklist {
    Node front, rear;

    // Enqueue operation
    void enqueue(int data) {
        Node newNode = new Node(data);

        // If queue is empty
        if (rear == null) {
            front = rear = newNode;
            System.out.println(data + " inserted into queue");
            return;
        }

        // Add node at rear
        rear.next = newNode;
        rear = newNode;

        System.out.println(data + " inserted into queue");
    }
    // Dequeue operation
    void dequeue() {
        // If queue is empty
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(front.data + " deleted from queue");

        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }
    }
    // Peek operation
    void peek() {

        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front element is: " + front.data);
    }

    // Display queue
    void display() {

        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;

        System.out.println("Queue elements:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        queueusinglinklist queue = new queueusinglinklist();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        queue.peek();

        queue.dequeue();

        queue.display();
    }
}
