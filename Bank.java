package com.javaintroduction;

public class Bank {
	static int accountno=100;
    String name;
    int amount;
    void display() {
    	System.out.println("Accountno:"+accountno);
    	System.out.println("name:"+ name);
    	System.out.println("amount:"+amount);
    {
    	accountno++;
    }
    }
	public static void main(String[] args) {
		Bank b  = new Bank();
		b.name = "pallavi";
        b.amount=3489;
        b.display();
		Bank b1 = new Bank();
	    b1.name="sravani";
	    b1.amount=4658;
	    b1.display();
        Bank b2 = new Bank();
        b2.name="kumari";
        b2.amount=54688654;
        b2.display();
	}

}
