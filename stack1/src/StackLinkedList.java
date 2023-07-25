import LinkedList.Node;

public class StackLinkedList {
    Node head;

    public StackLinkedList(Node head) {
        this.head = head;
    }

    public void push(Node newNode) {// O(1)
        newNode.next = head;
        head = newNode;
    }

    public void pop() {// O(1)
        head = head.next;
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.println(n.value);
            n = n.next;
        }
    }
}
