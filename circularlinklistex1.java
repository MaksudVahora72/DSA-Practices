class CircularNode {
    int data;
    CircularNode next;

    CircularNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class circularlinklistex1 {
    CircularNode head = null;
    CircularNode tail = null;

    void addbegin(int data) {
        CircularNode newNode = new CircularNode(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    void addlast(int data) {
        CircularNode newNode = new CircularNode(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void addposition(int data, int position){
        if (position == 1) {
            addbegin(data);
            return;
        }

        CircularNode newNode = new CircularNode(data);
        CircularNode temp = head;

        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        // If inserted at last position
        if (temp == tail) {
            tail = newNode;
        }
    }

    void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        CircularNode temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Head)");
    }

    public static void main(String[] args) {
        circularlinklistex1 cll = new circularlinklistex1();
        cll.addbegin(100);
        cll.addbegin(200);
        cll.addlast(300);
        cll.addposition(400,2);
        cll.traverse();
    }
}
