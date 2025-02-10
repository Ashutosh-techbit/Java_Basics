abstract class Car{
     public abstract void drive(); 
    //  beacuse of Abstraction when class Car extends in GWagon class  , it has to strictly consist of drive method in it

     public void playmusic(){
        System.out.println("music on");
     }
}

class GWagon extends Car{

    public void drive(){
        System.out.println("driving");
    }  

}


public class Abstraction {
    public static void main(String[] args) {
       
    //    object of Abstraction class(car) cannot be created but it can be used as type
        Car mycar = new GWagon();
        mycar.drive();
        mycar.playmusic();
    }
}
