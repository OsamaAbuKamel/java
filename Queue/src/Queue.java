public class Queue<T> {
    Object[] arrayObj;
    int rear;
    int front;
    int size;

    public Queue(int size) {
        this.size = size;
        arrayObj = new Object[this.size];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return (rear == -1 || front > rear);
    }

    boolean isFull() {
        return (rear == size - 1);
    }

    public void queue(Object newItem) {
        if (isFull()) {
            System.out.println("is full");
            return;
        }
        rear++;
        arrayObj[rear] = newItem;
        if (front == -1) {
            front = 0;
        }
    }

    public T deQueue() {
        if (isEmpty()) {
            System.out.println("is empty");
            return null;
        }
        T objectOut = (T) arrayObj[front];
        front++;
        return objectOut;

    }

}
