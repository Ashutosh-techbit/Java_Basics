// ENCAPSULATION---THIS keyword---GETTER & SETTER
class me{
    private String name;
    private int age;
     
    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    public String getname(){
        return name;

    }

    public void  setname(String n){
        name = n;
    }
    public int getage(){
        return age;

        
    }
public void  setage(int a){
        age = a;
    }
}


public class L42 {
  public static void main(String[] args){

    me obj=new me();
    obj.setage(12);
    obj.setname("bansal");

    System.out.println(obj.getname() + obj.getage());
}
}