public class stackusingarray {

    int stack[];
    int top;
    int size;

    stackusingarray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Push Operation
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop Operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

    // Peek Operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    // Display Stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        stackusingarray stack = new stackusingarray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.peek();

        stack.pop();

        stack.display();
    }
}
