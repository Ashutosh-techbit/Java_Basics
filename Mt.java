// class A extends Thread{
//     public void run(){
//         for(int i=0;i<100;i++){
//             System.out.println("hi");
//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         for(int i=0;i<100;i++){
//             System.out.println("helo");
//         }
//     }
// }
// public class Mt{
//     public static void main(String args[])
//     {
//         A obj1=new A();
//         B obj2 = new B();
 
//         obj2.setPriority(Thread.MAX_PRIORITY);

//         obj1.start();
//         obj2.start();
//     }
// }

class InvalidAgeException extends Exception{ 
    InvalidAgeException(String s){ 
    super(s);
    } }
    class TestCustomException1{ 
    static void validate(int age)throws InvalidAgeException{ 
    if(age<18)
    throw new InvalidAgeException("not valid"); 
    else
    System.out.println("welcome to vote"); 
    } 
    public static void main(String args[]){ 
    try{ 
    validate(13); 
    }catch(Exception m){System.out.println("Exception occured: "+m);} 
    System.out.println("rest of the code..."); 
    } }