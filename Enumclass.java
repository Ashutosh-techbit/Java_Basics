enum laptop{
    macbook(1222), lenovo(1231),Acer(233);
    private int price;

//   using private in constructor because it is using in same class
    private laptop(){

    }
    private laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}


public class Enumclass {
    public static void main(String[] args) {
        laptop lap =laptop.macbook;
    System.out.println(lap + " " + lap.getPrice());
    
    // laptop[] laps=laptop.values(); 
    for(laptop l : laptop.values()){
        System.out.println(l);
    }
    }
}


// /Notes::

// - We can not extend the enum with any other class.
// - We can define constructors and methods in an enum. Creation of our constructors and variables is also possible in an enum.
// - We can also define our data types through enum that are known as Enumerated Data Types.
// - In Java, enum extends the enum class and we get all other methods present inside an enum through the enum class only.
// - If we print the superclass of an enum class, then it will also return an enum.
//  Status s= Status.Success;
//  System.out.println(s.getClass().getSuperclass());
// - In an enum, every enum constant represents an object of type enum.



// Enum and Constructor:
// - enum contains a constructor and it is executed separately for each enum constant at the time of enum class loading.
// - We can create a constructor in an enum that can take any parameter, and that value of a parameter might be different in every object of an enum.
// - Instance variables in an enum are private and we can access them in another class by using getters and setters.
// - We can print the value of all objects of an enum through a loop and .values() method is used to iterating over all objects.
// - If any parameterized constructor is present inside an enum, then the default constructor will not be considered.
// - We create private variables and private constructors in an enum because we use them or create an object for constructors in the same class only.
// - The constructor in an enum will be called the number of times as much the number of objects created.