public class NodeDouble<T> {
    T value;
    NodeDouble next;
    NodeDouble pre;

    public NodeDouble(T value, NodeDouble next, NodeDouble pre) {
        this.value = value;
        this.next = next;
        this.pre = pre;
    }
}