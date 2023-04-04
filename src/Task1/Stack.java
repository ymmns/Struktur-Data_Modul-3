package Task1;

public class Stack {
    private String[] stackArray;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new String[capacity];
        this.top = -1;
    }

    public void push(String element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        this.stackArray[++this.top] = element;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return this.stackArray[this.top--];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.capacity - 1;
    }

    public int size() {
        return this.top + 1;
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return this.stackArray[this.top];
    }
}
