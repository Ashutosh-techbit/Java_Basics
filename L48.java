// More into object intialization and calling method 
class Demo{
    
    public Demo(){
        System.out.println("in constructor");
    }

    public void show(){
        System.out.println("in demo show");
    }

}


public class L48 {
    public static void main(String[] args) {
    
    // Demo obj = new Demo();
    Demo obj;  //initialzation of obj(refrence variable)
    obj = new Demo();  //object intialization and creation

    new Demo().show();  //only object creation and method calling


    }
}
