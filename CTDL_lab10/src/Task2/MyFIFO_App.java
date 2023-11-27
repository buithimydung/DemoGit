package Task2;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MyFIFO_App {
	// method stutter that accepts a queue of integers as a parameter and replaces
	// every element of the queue with two copies of that element
	// front [1, 2, 3] back
	// becomes
	// front [1, 1, 2, 2, 3, 3] back
    public static <E> void stutter(Queue<E> input) {
        int size = input.size();
        for (int i = 0; i < size; i++) {
            E element = input.poll();
            input.offer(element);
            input.offer(element);
        }
    }

   
    // Method mirror that accepts a queue of strings as a parameter and appends the
    // queue's contents to itself in reverse order
    // front [a, b, c] back
    // becomes
    // front [a, b, c, c, b, a] back
    public static <E> void mirror(Queue<E> input) {
        Queue<E> tempQueue = new LinkedList<>(input);
        while (!input.isEmpty()) {
            tempQueue.offer(input.poll());
        }
        while (!tempQueue.isEmpty()) {
            input.offer(tempQueue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        stutter(queue1);
        System.out.println(queue1); // Output: [1, 1, 2, 2, 3, 3]

        Queue<String> queue2 = new LinkedList<>(Arrays.asList("a", "b", "c"));
        mirror(queue2);
        System.out.println(queue2); // Output: [a, b, c, c, b, a]
    }
}