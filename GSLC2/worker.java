package GSLC2;

public class worker implements work{
	public String name;
	public String address;
	
	public worker(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void working(String name) {
		System.out.println(name+" is working");
	}
	
}
