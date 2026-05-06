class dblylistclass {
    int data;
    dblylistclass previous, next;

    dblylistclass(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

class doublylinkedlist {
    dblylistclass head;

    public void deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.previous = null;
    }
    public void deleteend() {
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null) {
            head = null;
            return;
        }
        dblylistclass current = head;
        while (current.next!=null) {
            current = current.next;
        }
        current.previous.next = null;
    }
    public void deletepos(int position) {
        if(head==null) {
            System.out.println("List is empty!");
            return;
        }
        if(position==0) {
            deletefirst();
            return;
        }
        dblylistclass current = head;
        for(int i=0; i < position && current.next!=null;i++) {
            current = current.next;
        }
        if(current==null) {
            System.out.println("Invalid position!");
            return;
        }
        if(current.next == null) {
            current.previous.next = null;
        }
        else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
    }
    public void traverse() {
        dblylistclass temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class doublelinkex2 {
    public static void main(String[] args) {
        doublylinkedlist dbllinked = new doublylinkedlist();
        dbllinked.head = new dblylistclass(10);
        dbllinked.head.next = new dblylistclass(20);
        dbllinked.head.next.previous = dbllinked.head;
        dbllinked.head.next.next = new dblylistclass(30);
        dbllinked.head.next.next.previous = dbllinked.head.next;
        dbllinked.head.next.next.next = new dblylistclass(40);
        dbllinked.head.next.next.next.previous = dbllinked.head.next.next;

        dbllinked.traverse();
        dbllinked.deletefirst();
        dbllinked.traverse();
        dbllinked.deleteend();
        dbllinked.traverse();
        dbllinked.deletepos(1);
        dbllinked.traverse();
    }
}
