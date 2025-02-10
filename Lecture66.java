// Abstraction + anonymous class


abstract class  A{
    public abstract void show();
   
}

public class Lecture66 {
    public static void main(String[] args) {
        A obj =new A(){
            // using abstract function to avoid errors
            public void show(){
                System.out.println("in C show");
            }

        };
        obj.show();
    }
}