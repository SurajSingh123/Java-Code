package test;

import java.util.Scanner;

public class Ques8 {
	void display() {
		System.out.println("Method with no return type");
	}

	int display1() {
		System.out.println("Method with return type");
		return 0;
	}

	int addition(int x, int y) {
		int z;
		z = x + y;
		System.out.println(z);
		System.out.println("This is the method with parameter");
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques8 obj = new Ques8();
		Scanner sc = new Scanner(System.in);
		obj.display();
		obj.display1();
		int x, y;
		System.out.println("Enter the two numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		obj.addition(x, y);

	}

}
