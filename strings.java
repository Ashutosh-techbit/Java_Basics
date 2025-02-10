public class strings {
    public static void main(String[] args)
    {
     String name = "ashu";
     String s = new String("ashu");
     System.out.println(s + "hello");
     System.out.println(s.hashCode()); //gives the ascii value of s
     System.out.println(s.charAt(1)); //gives character at index 1 of s
     System.out.println(s.concat("bansal"));
    }
}
