class calculator{
     int a;
     public int add(int num1,int num2)
     {
         int r=num1+num2;
         return r;
         
        }
    }
    public class cclass {
        public static void main(String[] args)
        {
            int a=2;
            int b=4;
            
            calculator calc = new calculator();
           int result=calc.add(a,b);
             System.out.println(result);
        }
} 
