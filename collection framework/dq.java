import java.util.*;
public class dq {
    public static void main(String[] args) {
        ArrayDeque<Integer> aq = new ArrayDeque<>();
        aq.offer(23);
        aq.offer(22);
        aq.offerFirst(12);
        aq.offerLast(11);

        System.out.println(aq.peek());
        System.out.println(aq.peekLast());


        System.out.println(aq);
    }}
