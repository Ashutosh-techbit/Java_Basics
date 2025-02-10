import java.util.*;

public class queue {
     public static void main(String arhs[]){

        Queue<Integer> num= new LinkedList<>();
        Queue<Integer> num1= new LinkedList<>();
            num.offer(12);
            num.offer(122);
            num.offer(123);
            num.offer(62);
            System.out.println(num); 
            System.out.println(num1.peek());  //return null
            System.out.println("element " + num.element()); 

            
            System.out.println(num.poll());
            System.out.println(num.peek()); 
            System.out.println(num); 

        
     }
}
