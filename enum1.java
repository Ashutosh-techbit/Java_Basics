enum Status{
    running , success , failed , pending;
}


public class enum1 {
    public static void main(String[] args) {
        Status s = Status.running;
        // System.out.println(s);
        // System.out.println(s.ordinal());

        // Status[] ss = Status.values();
        // for( Status s1 : ss){
        //     System.out.println(s1 + ":" + s1.ordinal());
        // }


        System.out.println(s.getClass().getSuperclass());

        // switch (s){
        //     case running:
        //     System.out.println("all good");
        //    break;
        //    case pending:        
        //     System.out.println("Wait");
        //     break;
        //     case failed:

        //     System.out.println("try agin");
        //     break;
        //    default :

        //     System.out.println("Done");
        // }


        // if(s == Status.running){
        //     System.out.println("all good");
        // }
        // else if(s == Status.pending){
        //     System.out.println("Wait");
        // }
        // else if (s == Status.failed) {
        //     System.out.println("try agin");
        // }
        // else{
        //     System.out.println("Done");
        // }
    }
  
}
