package DataStructures.LinkedList;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void delete() {

    }

    public void printList() {
        Node current = this.head;

        System.out.print("List: ");

        while (current != null) {
            System.out.print(current.data + " ");

            current = current.next;
        }
    }
}
