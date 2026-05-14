class stacknode {
    int data;
    Node next;

    stacknode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class stackusinglinklist {
    Node top;

    // Push operation
    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        System.out.println(data + " pushed into stack");
    }

    // Pop operation
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(top.data + " popped from stack");
        top = top.next;
    }

    // Peek operation
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element is: " + top.data);
    }

    // Display stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        System.out.println("Stack elements:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        stackusinglinklist stack = new stackusinglinklist();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.peek();

        stack.pop();

        stack.display();
    }
}
