public class typeconversion {
    public static void main(String args[]){
         

        // type casting

        byte r= 12;
        int z=(int)r;
        // System.out.print(z);
   
        int d=257;
        byte u= (byte)d;  //the range of byte is form 0 to 255
        System.out.println(u);

        float a = 121.23f;
        // int b = (int)a;
         int   b = (char)a;
        // float b = (int)a;
        // System.out.print(b);

        // type conversion

        byte k=10;
        byte j=90;
         
        // here result is 900 which is out of range of byte therefore java provides feature of type conversion to increase the range
        int result= k*j;
        System.out.println(result);

    }
}
