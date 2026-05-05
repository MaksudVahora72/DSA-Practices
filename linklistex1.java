class Node {
    int data;
    Node next;
    public Node(int value){
        this.data = value;
    }
}

class Linkedlist {
    Node head = null;
    public void addnode(int data) {
        Node newnode = new Node(data);
        Node current = head;

        if(head==null) {
            head = newnode;
        }
        else {
            while(current.next!=null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }
    public void addfirst(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
    public void addlast(int data) {
        Node newnode = new Node(data);
        newnode.next = null;

        if(head==null) {
            head = newnode;
            return;
        }
        Node current = head;
        while (current.next!=null) {
            current=current.next;
        }
        current.next = newnode;
    }
    public void traverse() {
        for(Node current=head; current!=null; current = current.next) {
            System.out.println(current.data);
        }
    }
    public void addbetween(int data, int position) {

        Node newnode = new Node(data);
        if(position<0) {
            System.out.println("Invalid position");
            return;
        }
        if(position==0) {
            newnode.next = head;
            head = newnode;
            return;
        }
        Node current = head;
        for(int i=0;i<position-1 && current!=null;i++) {
            current=current.next;
        }
        if(current==null) {
            System.out.println("Invalid position!");
            return;
        }
        newnode.next = current.next;
        current.next = newnode;
    }
}
public class linklistex1 {
    public static void main(String[] args) {
        Linkedlist lnklst = new Linkedlist();
        lnklst.addnode(10);
        lnklst.addnode(15);
        lnklst.addfirst(5);
        lnklst.addlast(20);
        lnklst.addbetween(100,20);
        lnklst.traverse();
    }
}
