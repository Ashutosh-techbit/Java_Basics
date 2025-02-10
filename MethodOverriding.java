// in MethodOverriding tow different classes having inheritance and have methods with same name and parameters.
// in such methods class execute methods of itself class

class A{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
class B extends A{
    public int add(int n1,int n2){
        return n1+n2+1;
    }
}


public class MethodOverriding{
    public static void main(String[] args) {
       B obj= new B();
       int r=obj.add(3, 5);
       System.out.println(r);
              
    }
}