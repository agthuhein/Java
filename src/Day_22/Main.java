package src.Day_22;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("###Priority Queue### ");
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(10);  //Highest priority
        priorityQueue.add(50);
        priorityQueue.add(5);

        System.out.println("Priority Queue" + priorityQueue);

        if(!priorityQueue.isEmpty()){
            int removeElement = priorityQueue.poll();
            System.out.println("Remove element: " + removeElement);
            int head = priorityQueue.peek();
            System.out.println("Head: " + head);
        }
        System.out.println("Priority Queue" + priorityQueue);
        System.out.println("########################################## ");
        System.out.println("########################################## ");

        System.out.println("\n####Array Deque#### ");
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("First");
        deque.addLast("Second");
        deque.addLast("Third");
        deque.addLast("Fourth");

        System.out.println("Array Deque" + deque);
        String removeElement = deque.removeFirst();
        System.out.println("Remove first element: " + removeElement);

        String removeLastElement = deque.removeLast();
        System.out.println("Remove last element: " + removeLastElement);
        System.out.println(deque);

        String peek = deque.peekFirst();
        System.out.println("Peek first element: " + peek);
        System.out.println(deque);

        String peekLast = deque.peekLast();
        System.out.println("Peek last element: " + peekLast);
        System.out.println(deque);
    }
}
