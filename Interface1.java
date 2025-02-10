// instead of
//  abstract we can use Interface
//  extends-> implements


// abstract class Computer{
//     public abstract void code();
// }
interface Computer{
     void code();
}


// class desktop extends Computer{
class desktop implements Computer{
    public void code(){
        System.out.println("Using desktop");
    }
}
class laptop  implements Computer{
    public void code(){
        System.out.println("Using laptop");
    }
}




class developer{
    public void devapp(Computer lap){
         lap.code();  

    }
}

public class Interface1{
    public static void main(String[] args) {
          developer ashu= new developer();
          Computer lap = new laptop();
          Computer desk = new desktop();
          
        ashu.devapp(lap);
        ashu.devapp(desk);
    }
}