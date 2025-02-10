// CONSTRUCTOR
class Human{

    private int age;
    private String name;
    
    // default constructor
    public Human(){
        age=12;
        name="ashu";
    }

    // parameterised constructor
    public Human(int a , String n)
    {
        age=a;
        name=n;
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

public class L46{
    
      public static void main(String[] args) {

    Human obj= new Human();
    
    Human obj1= new Human(24,"ashutosh");

    // bydefault values for constructor
    System.out.println(obj.getAge() + " " + obj.getName());
    System.out.println(obj1.getAge() + " " + obj1.getName());

    obj.setAge(23);
    obj.setName("bansal");

    // values after intialzation from users
    System.out.println(obj.getAge() + " " + obj.getName());
      }

    }
    
