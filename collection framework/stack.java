import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> str= new Stack<>();
        str.push("ashu");
        str.push("ram");
        str.push("ramu");
        str.push("ramesh");
        str.push("harsh");

        System.out.println(str.peek());
        System.out.println(str.pop());
        System.out.println(str.pop());
        System.out.println(str.push("passn"));

    System.out.println(str);
    }
}
