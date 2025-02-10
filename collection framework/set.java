import java.util.*;
public class set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); //random order
        // Set<Integer> set = new LinkedHashSet<>(); //order same as user inserted
        // Set<Integer> set = new TreeSet<>();  //sorted elements

        set.add(12);
        set.add(134);
        set.add(14);
        set.add(34);

        System.out.println(set);
    }
}
