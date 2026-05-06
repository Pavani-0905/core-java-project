package com.javaintroduction;
public class Testdemo2 {
	byte b;
	byte b1=(byte)430;           // byte value range is 2^7--- -128 to 127
	short s;
	short s1=(short)32769; 
	short s2=(byte)59325946;                              // short value range is 2^15--- -32768 to 32767
	int i;
	int i1=(int)576458760;  
	int i2=(short)45896821;    
	int i3=s2;                                                  //  integer value range is 2^31
	long l;
	long l1=(long)23587549234L; 
	long l2=(int)4859845694126L;                                                       // long value range is 2^63
	float f=60.8f;
	float f1=(float)100.00f;
	char c;
	char c1=76;
	boolean boo;
	boolean b2=false;
	

	public static void main(String[] args) {
    Testdemo2 t = new Testdemo2();
    System.out.println("byte value : " + t.b);
    System.out.println("byte value : " + t.b1);
    
    System.out.println("short  value : " + t.s);
    System.out.println("short value : " + t.s1);
    System.out.println("short value : " + t.s2);
    
    
    System.out.println("int value : " + t.i);
    System.out.println("int value : " + t.i1);
    System.out.println("int value : " + t.i2);
    System.out.println("int value : " + t.i3);
    
    
    System.out.println("long value : " + t.l);
    System.out.println("long value : " + t.l1);
    System.out.println("long value : " + t.l2);
    
    System.out.println("float value : " + t.f);
    System.out.println("float value : " + t.f1);

    System.out.println("char value : " + t.c);
    System.out.println("char value : " + t.c1);
    
    System.out.println("boolean value : " + t.boo);
    System.out.println("boolean value : " + t.b2);
	}

}
// type casting means converts one datatype to another datatype 
//here we have 2 types of datatypes
//there are implicit datatype,explicit datatype
//explicit datatype:high level datatype to low level dadatype
//implicit datatype:low level datatype to high level datatype