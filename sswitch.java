public class sswitch {
    public static void main(String[] args)
    {
        int n=4;
        // switch(n)
        // {
        //     case 1:
        //     System.out.print("hello");
        //     break;
        //     case 2:
        //     System.out.print("hlo");
        //     break;
        //     default:
        //     System.out.print("helo");
        //     break;
        // }

        // switch without break
        switch(n){
            case 1, 2 ->
            System.out.print("hlo");
            case 3,4 ->
            System.out.print("hlllo");

        }
        

        // switch with colon and yield(instead of break) 
        String day = "Wed";
        String result = "";

        result = switch(day)
            {
          case "Saturday", "Sunday" : yield "6am";
          case "Monday" : yield "8am";
          default: yield "7am";
        };
        System.out.println(result);
    }

}
