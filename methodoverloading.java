class sum
{
    public int add(int x,int y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public double add(double  x,  int y,int z)
    {
        return x+y+z;
    }
}


public class methodoverloading {
      public static void main(String[] args){
sum obj=new sum();
// int r=obj.add(2,3,45);
// int r=obj.add(2,23,45);
double r=obj.add(2.223,23,45);
System.out.print(r);
      }
}
