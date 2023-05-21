package GSLC2;

public class manager extends upperrank{
	public manager(String name, int age, int pay, int tenure) {
		super(name, age, pay, tenure);
	}
	
	public void working(String name) {
		System.out.println(name+" is working");
	}
}
