package Latihan2;
import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    public void QueueExample() {
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");

        System.out.println("Remove : " +queue.remove());
        System.out.println("Element : " +queue.element());
        System.out.println("Poll : " +queue.poll());
        System.out.println("Peek : " +queue.peek());
    }
    public static void main(String[] args) {
        new Queues().QueueExample();
    }
}
