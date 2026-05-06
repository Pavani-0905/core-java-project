package com.javaintroduction;

public class Customer {
	protected void finalize(){
		System.out.println("finalize method called");
	}

	void getCustomer() {
		System.out.println("customer method called");
		Customer c4 = new Customer(); 
		}
	public static void main(String[] args) {
		System.out.println("Main method started");
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		new Customer().getCustomer();
		c2=c1;
		System.gc();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("Main method ended");
		
		

	}

}
