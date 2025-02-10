public class dsa {
    public static void main(String args[]){

      String  s= "Marge, let's \\\"[went].\\\" I await {news} telegram.";
      
        String str = s.toLowerCase();
        String str1="" ;
        String str2="" ;
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>96 && str.charAt(i)<123 || str.charAt(i)>47 && str.charAt(i)<58)
            {
                str1+=str.charAt(i);
                
            }
        }
        // str=str1;
        System.out.println(str1);
        // System.out.println("hi");


        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)>96 && str.charAt(i)<123 || str.charAt(i)>47 && str.charAt(i)<58)
            {
                str2+=str.charAt(i);
            }
        }
        // System.out.println("bye");
        System.out.println(str2);
                
       if(str1.equals(str2))
       {
            System.out.print("true");
            // return true;
        }
        else{
            System.out.print("false");
            // return false;
        }
       

        
}}
