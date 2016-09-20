package test;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out
				.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out
				.println("Here i am declaring the variable and user giving the input and then printing the input value");
		System.out
				.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		char ch;// Here declaring the variable as character
		System.out.println("Enter the  value of ch");// Here user giving input
		ch = sc.next().charAt(0);// Here i am reading character variable
		System.out.println("The char value of ch is=" + ch);// Here i am
															// printing the user
															// value
		boolean b;// Here declaring the variable as boolean
		System.out.println("Enter the  value of b");// Here user giving input
		b = sc.hasNext();// Here i am reading boolean variable
		System.out.println("The boolean value of b is=" + b);// Here i am
																// printing the
																// user value
		byte a;// Here declaring the variable as byte
		System.out.println("Enter the  value of a");// Here user giving input
		a = sc.nextByte();// Here i am reading byte variable
		System.out.println("The byte value of a is=" + a);// Here i am printing
															// the user value
		short t1;// Here declaring the variable as short
		System.out.println("Enter the  value of t1");// Here user giving input
		t1 = sc.nextShort();// Here i am reading short variable
		System.out.println("The short value of t1 is=" + t1);// Here i am
																// printing the
																// user value
		long t2;// Here declaring the variable as long
		System.out.println("Enter the  value of t2");// Here user giving input
		t2 = sc.nextLong();// Here i am reading long variable
		System.out.println("The long value of t2 is=" + t2);// Here i am
															// printing the user
															// value
		int x;// Here declaring the variable as int
		System.out.println("Enter the  value of x");// Here user giving input
		x = sc.nextInt();// Here i am reading int variable
		System.out.println("The integer value of x is=" + x);// Here i am
																// printing the
																// user value
		float y;// Here declaring the variable as float
		System.out.println("Enter the value of y");// Here user giving input
		y = sc.nextFloat();// Here i am reading float variable
		System.out.println("The value of y is=" + y);// Here i am printing the
														// user value
		double z;// Here declaring the variable as double
		System.out.println("Enter the value of z");// Here user giving input
		z = sc.nextDouble();// Here i am reading double variable
		System.out.println("The value of z is =" + z);// Here i am printing the
														// user value
		String strr;// Here declaring the variable as String
		System.out.println("Enter the string strr");// Here user giving input
		strr = sc.next();// Here i am reading String variable
		System.out.println("Enetered string is =" + strr);// Here i am printing
															// the user value
		String str;// Here declaring the variable as String
		System.out.println("Enter the string str");// Here user giving input
		str = sc.nextLine();// Here i am reading String variable
		System.out.println("Enetered string is =" + str);// Here i am printing
															// the user value
	}

}
