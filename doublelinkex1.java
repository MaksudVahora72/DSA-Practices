class dblnode {
    int data;
    dblnode previous, next;
    public dblnode(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}
class doublylink {
    dblnode head;

    public void addbegin(int data) {
        dblnode newnode = new dblnode(data);
        if(head != null) {
            head.previous = newnode;
            newnode.next = head;
        }
        head = newnode;
    }
    public void addnode(int data) {
        dblnode newnode = new dblnode(data);
        if(head==null) {
            newnode.previous = null;
            newnode.next = null;
            head = newnode;
            return;
        }
        dblnode current = head;
        while(current.next!=null) {
            current = current.next;
        }
        newnode.previous = current;
        newnode.next = null;
        current.next = newnode;
    }
    public void addlast(int data) {
        dblnode newnode = new dblnode(data);
        if(head!=null) {
            dblnode current = head;
            while(current.next!=null) {
                current = current.next;
            }
            newnode.previous = current;
            newnode.next = null;
            current.next = newnode;
        }
    }
    public void addposition(int data, int position) {
        dblnode newnode = new dblnode(data);

        if(position < 0) {
            System.out.println("Invalid position!");
            return;
        }
        if(position == 0) {
            addbegin(data);
            return;
        }
        dblnode current = head;
        for(int i = 0;i < position-1 && current != null;i++) {
            current = current.next;
        }
        if(current == null) {
            System.out.println("Invalid position");
            return;
        }
        newnode.next = current.next;
        newnode.previous = current;

        if(current.next != null) {
            current.next.previous = newnode;
        }
        current.next = newnode;
    }
    public void traverse() {
        dblnode current = head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }
}
public class doublelinkex1 {
    public static void main(String[] args) {
        doublylink dblylink = new doublylink();
        dblylink.addnode(10);
        dblylink.addnode(20);
        dblylink.addnode(30);
        dblylink.addbegin(40);
        dblylink.addlast(50);
        dblylink.addposition(100,2);
        dblylink.traverse();
    }
}
