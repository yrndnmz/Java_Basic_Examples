
class QueueOfIntegers {

    private int[] elements;
    private int size;
    private int capacity;

    public QueueOfIntegers(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
    }

    public QueueOfIntegers() {
        this(8);
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[size * 2];
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }
        elements[size++] = v;

    }

    public int dequeue() {
        int v = elements[0];
        size--;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return v;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

}

public class TestQueueOfIntegers {

    public static void main(String[] args) {

        QueueOfIntegers queue = new QueueOfIntegers();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }

        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
