import java.util.Arrays;

public class StackArrayDynamic<T> {

    int size;
    Object[] array;
    int top;

    public StackArrayDynamic(int size) {
        this.size = size;
        array = new Object[this.size];
        top--;
    }

    public void push(Object newItem) {
        ensureCapacity(top + 2);
        top = top + 1;
        array[top] = newItem;
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = array.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public T pop() {
        ensureCapacity(top - 2);
        T item = (T) array[top];
        top--;
        return item;

    }

    public boolean isEmpty() {
        return (top == -1);
    }

}
