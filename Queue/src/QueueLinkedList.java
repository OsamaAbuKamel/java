public class QueueLinkedList<T> {
    NodeDouble<T> rear;
    NodeDouble<T> front;

    public QueueLinkedList(NodeDouble newNode) {
        rear = newNode;
        front = newNode;
    }

    public void queue(NodeDouble newNode) {
        newNode.next = null;
        newNode.pre = rear;
        rear.next = newNode;
        rear = newNode;
    }

    public T deQueue() {
        T value = front.value;
        front = front.next;
        front.pre = null;
        return value;

    }
}