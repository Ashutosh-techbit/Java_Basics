// INHERITANCE - inherit parent class property into child class


public class L49 {
    public static void main(String[] args) {
        
        // using AdvCalc.class for inherit property of add() and subn()
        AdvClac obj = new AdvClac();
        int r1 = obj.add(1,2);
        int r2 = obj.sub(5,7);
        int r3 = obj.div(5,7);
        int r4 = obj.multi(5,7);

        System.out.println(r1 + " " + r2 +" "+r3 + " " + r4);
    }
}
