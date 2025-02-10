class Mobile{
	String brand;
	int price;
	String network;
	static String name;
	
	// static class will load and execute as soon as some other class will be execute.
	// static class will always load and exexcute first in class loader system
	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	public Mobile() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor" + price);
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	
}

public class L41 {
	public static void main(String[] args) throws ClassNotFoundException
	{
		// load static class even if none of the other class is called+++++
		Class.forName("Mobile");
		
		// Mobile obj1=new Mobile();
		// obj1.brand="Apple";
		// obj1.price=1500;
		// Mobile.name="SmartPhone";
		
		// Mobile obj2=new Mobile();

	
	}
}