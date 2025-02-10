class  A{
    public void show(){
        System.out.println("in a show");
    }
}

// now to change the functionality of show in A either we create a 
// class B extends A {
//     public void show(){
//         System.out.println("in B show");
//     }
// }
// but after everytime we made a class their is a file of class created so instead of making a class we cn use anonymous inner class direct in main function





public class Innerclass {
    public static void main(String[] args) {
        A obj =new A(){

            public void show(){
                System.out.println("in C show");
            }

        };
        obj.show();
    }
}
