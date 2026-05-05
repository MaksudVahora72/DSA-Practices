class Nodeclass {
    int data;
    Nodeclass next;

    Nodeclass(int data) {
        this.data = data;
        this.next = null;
    }
}
class Linkedlistopt {
    Nodeclass head = null;

    public void begindelete() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteend() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Nodeclass current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public void deleteposition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if(position < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Nodeclass current = head;
        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Invalid position");
            return;
        }

        current.next = current.next.next;
    }

    public void traverse() {
        Nodeclass current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class linklistex2 {
    public static void main(String[] args) {
        Linkedlistopt list = new Linkedlistopt();

        list.head = new Nodeclass(10);
        list.head.next = new Nodeclass(20);
        list.head.next.next = new Nodeclass(30);
        list.head.next.next.next = new Nodeclass(40);

        list.traverse();

        System.out.println("Delete begining operation");
        list.begindelete();
        list.traverse();

        System.out.println("Delete last operation");
        list.deleteend();
        list.traverse();

        System.out.println("Delete at position operation");
        list.deleteposition(1);
        list.traverse();
    }
}
