package GSLC2;

public class director extends upperrank implements financial{
	public int finance;
	public director(String name, int age, int pay, int tenure, int finance) {
		super(name, age, pay, tenure);
		this.finance = finance;
	}
	
	public void working(String name) {
		System.out.println(name+" is working");
	}
	
	public void viewfinancial(int finance) {
		System.out.println("current financial is "+finance);
	}
}
