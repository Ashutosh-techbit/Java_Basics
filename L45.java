// CONSTRUCTOR
   class Human{

    private int age;
    private String name;
    
    // constructor
    // no need to mention datatype
    // name same as class name
    // everytime object is created constructor will be called bydefault
    //    in constructor values are kept to b set bydefault during development
    public Human(){
        // System.out.println("in constructor");
        age=12;
        name="ashu";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    }

public class L45{
    
      public static void main(String[] args) {
    Human obj= new Human();
    // bydefault values for constructor
    System.out.println(obj.getAge() + " " + obj.getName());

    obj.setAge(23);
    obj.setName("bansal");

    // values after intialzation from users
    System.out.println(obj.getAge() + " " + obj.getName());
      }

    }
    
