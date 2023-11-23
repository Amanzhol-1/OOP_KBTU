package Problem3;
public class Array<E> implements MyArray<E> {
    private Object[] elements; 
    private int size; 
    private final int capacity; 

    public Array(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
        size = 0;
    } 

    @Override
    public void add(E element) {
        if (size < capacity) {
            elements[size++] = element; 
        } else {
            throw new IllegalStateException("Array is full");
        }
    } 

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}

