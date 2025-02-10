// during compile time we donot which show() method is called from which class.
// -- we can know during run time which show method is called this is known as run time polymorphism.
// -- all this concept is class dynamic method dispatch

// Polymorphism = differ ent methods having same property

class A{
    public void show(){
        System.out.println("in a");
    }
}
class B extends A{
    public void show(){
        System.out.println("in b");
    }
}
class C extends B{
    final  public void show(){
        System.out.println("in c");
    }
}

public class Lecture56 {
    public static void main(String[] args) {
    A obj = new A();
    obj.show();                

    obj = new B();
    //reference is A (we can use reference of parents) and create object of B  and assign to parents reference variable.
    obj.show();
    // a new show() will be craeted in heap memory which will now belongs to class B and obj is now reference to that show

    obj = new C();
    //reference is A or B (we can use reference of parents) and create object of B  and assign to parents reference variable.
    obj.show();  
     // a new show() will be craeted in heap memory which will now belongs to class C and obj is now reference to that show
    }
}

