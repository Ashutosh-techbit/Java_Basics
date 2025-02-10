// custopm exception
class AshuException extends Exception{
  public AshuException(String str){
     super(str);
  }
}

public class Exception1{
         public static void main(String[] args) {
            

            int i =0;
            int j=0;
             
            // int num[] =new int[5];
            // String str=null;
            try{
                j  = 10/i;
                if(j==0)
                        throw new AshuException("Custom exception");                    
   
                    // throw new ArithmeticException("Illegal operation"); //if error occured in try block "throw" will throw a Exception andd catch will catch the exception and print in the end 

                // System.out.println(str.length());
                // System.out.println(num[1]);
                // System.out.println(num[5]);
            }
            catch(AshuException e1){
                j = 18/1;
                System.out.println("Error 404" + "  :  " + e1);
            }
            
            catch(Exception e){
                System.out.println("Error Occured" + "  :  " + e);
            } 
            finally{
                System.out.println("in finally");
            }

            System.out.println(j);
            System.out.println("bye");
         }
}