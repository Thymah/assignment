import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();

        integerPriorityQueue.add(1);
        integerPriorityQueue.add(2);
        integerPriorityQueue.add(3);
        integerPriorityQueue.add(4);
        System.out.println(integerPriorityQueue);
        integerPriorityQueue.offer(5);

        System.out.println(integerPriorityQueue);

        integerPriorityQueue.remove(2);
        System.out.println(integerPriorityQueue);

        System.out.println(integerPriorityQueue.poll());
        System.out.println(integerPriorityQueue);
        System.out.println(integerPriorityQueue.peek());
        System.out.println(integerPriorityQueue.toArray().toString());
        System.out.println(integerPriorityQueue.contains(5));
        System.out.println(integerPriorityQueue.size());
        integerPriorityQueue.clear();

    }
}

