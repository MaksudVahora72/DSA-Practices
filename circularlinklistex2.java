class DeleteNode {
    int data;
    DeleteNode next;

    DeleteNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class circularlinklistex2 {
    DeleteNode head = null;
    DeleteNode tail = null;

    void addend(int data) {
        DeleteNode newNode = new DeleteNode(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void deletebegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        // Only one node
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    void deleteend() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head == tail) {
            head = tail = null;
            return;
        }

        DeleteNode temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
    }

    void deletepos(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete first node
        if (position == 1) {
            deletebegin();
            return;
        }

        DeleteNode temp = head;

        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        DeleteNode deleteNode = temp.next;

        // If deleting tail node
        if (deleteNode == tail) {
            tail = temp;
        }

        temp.next = deleteNode.next;

    }

    void traverse() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        DeleteNode temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Back to Head)");
    }

    public static void main(String[] args) {
        circularlinklistex2 cll  = new circularlinklistex2();
        cll.addend(10);
        cll.addend(20);
        cll.addend(30);

        cll.deletebegin();
        cll.traverse();
        cll.deleteend();
        cll.traverse();
        cll.deletepos(1);
        cll.traverse();
    }
}
