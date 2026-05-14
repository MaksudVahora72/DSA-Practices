public class queueusingarray {
    int queue[];
    int front;
    int rear;
    int size;

    queueusingarray(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = data;

        System.out.println(data + " inserted into queue");
    }

    // Dequeue operation
    void dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(queue[front] + " removed from queue");
        front++;
    }

    // Peek operation
    void peek() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front element is: " + queue[front]);
    }

    // Display queue
    void display() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements:");

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        queueusingarray q = new queueusingarray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.peek();

        q.dequeue();

        q.display();
    }
}
