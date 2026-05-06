package com.javaintroduction;

public class Student{
		int a;
		long p;
		byte i;
		short n;
     void show() {
        a=(byte)572;
        System.out.println(a);
        p=(int)23786668348L;
        System.out.println(p);
        i=(byte)344;
        System.out.println(i);
        n=54;
        System.out.println(n);
    }
	public static void main(String[] args) {
		 Student s = new Student();
		 s.show();
		 
	}

}
