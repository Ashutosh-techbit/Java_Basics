//  final uses with method/classes/variables
// it makes variables constant / final maikes classes and methods inaccessible thorugh extends keywords and same method name usage 
 final class A{
     public static void show( ){
         System.out.println("in a");
        }
    }
    class B extends A{
        
    }
    
    
    
    public class Final {
        public static void main(String[] args) {
        final int a=190;
        a=35;
        A obj = new A();
        A.show(123);


    }
}
