import java.util.*;

public class pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        
        pq.offer(42);
        pq.offer(12);
        pq.offer(22);
        pq.offer(32);

        pq1.offer(42);
        pq1.offer(12);
        pq1.offer(22);
        pq1.offer(32);

        System.out.println(pq.poll());

        System.out.println(pq);
        System.out.println(pq1);

    }
}
