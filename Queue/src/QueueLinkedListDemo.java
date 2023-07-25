public class QueueLinkedListDemo {
    public static void main(String[] args) {
        NodeDouble<Integer> node = new NodeDouble<Integer>(12, null, null);
        QueueLinkedList<Integer> queueLinkedList = new QueueLinkedList<>(node);
        queueLinkedList.queue(new NodeDouble<Integer>(11, null, null));
        queueLinkedList.queue(new NodeDouble<Integer>(2, null, null));
        queueLinkedList.queue(new NodeDouble<Integer>(22, null, null));
        System.out.println(queueLinkedList.deQueue());
    }
}
