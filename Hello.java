package com.javaintroduction;

public class Hello {
	static void demo() {
		System.out.println("static method called.");
	}
    void sample()
    {
    	System.out.println("instance method called.");
    	demo();
    }
	public static void main(String[] args) {
	    System.out.println("run successfully.");
		Hello h = new Hello();
        h.sample();

}
}

