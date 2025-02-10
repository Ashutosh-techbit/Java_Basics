@FunctionalInterface  //interface which have only one method
interface A{
    // void show();
    // void show(int i);
    int add(int i,int j);
}
// class B implements A{
    
// }




public class functionalinterface {
    public static void main(String[] args) {
        // A obj =new A() {
        //     public void show()
        //     {
        //         System.out.println("in show");
        //     };
        // };


        // lambda expression
        // A obj = () -> System.out.println("in show");
        // A obj = (int i) -> System.out.println("in show"); for show(int i)
        // obj.show();


        A obj = (i,j)-> i+j;
        System.out.println(obj.add(2, 4));
    }
}
