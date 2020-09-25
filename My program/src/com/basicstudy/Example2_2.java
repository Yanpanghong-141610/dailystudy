package com.company;

public class Example2_2 {

    public static void main(String[] args) {
	 byte b = 22;
	 int n = 129;
	 float f = 12345.68f;
	 double d = 1234.1234567890;

	 System.out.println("b="+b);
	 System.out.println("n="+n);
	 System.out.println("f="+f);
	 System.out.println("d="+d);

	 b=(byte)n;
	 f=(float)d;

	 System.out.println("b=" +b);
	 System.out.println("f=" +f);
    }
}
