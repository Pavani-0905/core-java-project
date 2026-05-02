package com.javaintroduction;

public class numbers {
	static int  count=0;
	{
       count++;   
    }
    public static void main(String[] args) {
        numbers n = new numbers();
        numbers n1 = new numbers();
        System.out.println(n.count);
	}

}
