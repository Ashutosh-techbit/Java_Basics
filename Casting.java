class A{
   public void show1(){
    System.out.println("in show A");
   }
}
class B extends A{
public void show2(){
    System.out.println("in show B");
}
}



public class Casting {
    public static void main(String[] args) {

        A obj = (A)new B();  //upcasting 
        obj.show1();

     // obj1.show2(); // you get error and you are not able to call show2() because with parents             reference specialised method of child is not visible
       //   here we downcastig to use show2() method
       B obj1 = (B) obj;
       obj1.show2();
       obj1.show1();
       ((B)obj).show2(); //downcasting

    }
}
