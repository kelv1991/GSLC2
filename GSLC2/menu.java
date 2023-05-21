package GSLC2;

import java.util.*;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int finance = 350000000;
		Scanner sc = new Scanner(System.in);
		System.out.println("choose a role:\n1. director\n2. manager\n3. worker\n");
		choice = sc.nextInt();
		if(choice == 1) {
			String name;
			int action = 0;
			int age;
			int pay;
			int tenure;
			System.out.println("name: ");
			name = sc.next();
			System.out.println("age: ");
			age = sc.nextInt();
			System.out.println("pay: ");
			pay = sc.nextInt();
			System.out.println("tenure: ");
			tenure = sc.nextInt();
			director d = new director(name, age, pay, tenure, finance);
			
			while(action != 3) {
				System.out.println("choose an action:\n1. view financial\n2. get raise\n3. go to work\n");
				action = sc.nextInt();	
				if(action == 1) {
					d.viewfinancial(finance);
				}	
				else if(action == 2) {
					d.raise(tenure);
				}
				else {
					d.working(name);
				}
			}
		}
			
		else if(choice == 2) {
			String name;
			int action = 0;
			int age;
			int pay;
			int tenure;
			System.out.println("name: ");
			name = sc.next();
			System.out.println("age: ");
			age = sc.nextInt();
			System.out.println("pay: ");
			pay = sc.nextInt();
			System.out.println("tenure: ");
			tenure = sc.nextInt();
			manager m = new manager(name, age, pay, tenure);
			
			while(action != 2) {
				System.out.println("choose an action:\n1. get raise\n2. go to work\n");
				action = sc.nextInt();
				if(action == 1) {
					m.raise(tenure);
				}	
				else {
					m.working(name);
				}	
			}
		}
		else {
			String name;
			String address;
			System.out.println("name: ");
			name = sc.next();
			System.out.println("address: ");
			address = sc.next();
			worker w = new worker(name, address);
			w.working(name);
		}
		sc.close();
	}

}
