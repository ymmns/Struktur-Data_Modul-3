package Task2;

public class QueueManuals {
    private Object[] queue;
    private int front;
    private int rear;
    private int maxSize;

    public QueueManuals(int maxSize) {
        this.maxSize = maxSize;
        queue = new Object[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(Object item) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }

        rear++;
        queue[rear] = item;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }

        Object item = queue[front];
        front++;
        return item;
    }

    public boolean isEmpty() {
        return (rear < front);
    }

    public boolean isFull() {
        return (rear == maxSize - 1);
    }

    public int size() {
        return (rear - front + 1);
    }
}
