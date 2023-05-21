package GSLC2;

public abstract class upperrank implements work{
	public String name;
	public int age;
	public int pay;
	public int tenure;
	public upperrank(String name, int age, int pay, int tenure) {
		this.name =name;
		this.age = age;
		this.pay = pay;
		this.tenure = tenure;
	}
	
	void raise(int tenure){
		if(tenure < 10) {
			System.out.println("no raise");
			System.out.println("pay: " + pay);
		}
		else {
			System.out.println("raise " + tenure * 100000);
			pay = pay + tenure * 100000;
			System.out.println("pay: " + pay);
		}
	}
}
