package com.javaintroduction;

public class testdemo1 {
	protected void finalize() {
		System.out.println("finalize method called");
	}
	public static void main(String[] args) {
		testdemo1 t1 = new testdemo1();
		testdemo1 t2 = new testdemo1();
		testdemo1 t3 = new testdemo1();
		t1=null;
		t2=null;
		t3=null;
        System.gc();
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
		
		
	}

}
