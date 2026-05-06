package com.javaintroduction;

import java.lang.classfile.CodeBuilder.BlockCodeBuilder;

public class Testdemo3 {
	{
	System.out.println("instance Block called");
	}
	
   static {
	  System.out.println("static Block1 called");
	  Testdemo3 t = new Testdemo3();
	}
	static {
		System.out.println("static block2 called");
	}
	public static void main(String[] args) {
	System.out.println("main method called");
	Testdemo3 t = new Testdemo3();

	}

}
