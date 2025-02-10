public class string2 {
    
   public static void main(String[] args){
     
    StringBuffer sb =new StringBuffer("ashu");
    sb.append(" bansal");
    sb.deleteCharAt(0); //delete elemnt at index 0 
    sb.insert(0, "A"); 
    System.out.println(sb); 
    
    System.out.println(sb.capacity()); //by default buffer takes space of 16 characters
    System.out.println(sb.length());  //it gives the lenght of string  
   }

}
