
public class StackArray<T> {
    int size;
    Object[] array;
    int top;

    public StackArray(int size) {
        this.size = size;
        array = new Object[this.size];
        top--;
    }

    public void push(Object newItem) {
        if (isFull())
            return;
        top = top + 1;
        array[top] = newItem;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null; // is empty
        }
        T item = (T) array[top];
        top--;
        return item;

    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

}
