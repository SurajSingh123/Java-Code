package test;

import java.util.Scanner;

public class Ques5 {
	void even_odd(int num) {
		if (num % 2 == 0) {
			System.out.println("The given number is even");
		} else {
			System.out.println("The given number is odd");
		}
	}

	static void Another_method_even_odd(int n) {
		String a[] = { "Even", "Odd" };
		System.out.println(a[n % 2]);
	}

	int Maximum(int x, int y, int z) {
		int max;
		max = ((x >= y && x >= z) ? x : (y >= z ? y : z));
		return max;
	}

	int minimum(int x, int y, int z) {
		int min;
		min = ((x <= y && x <= z) ? x : (y <= z ? y : z));
		return min;
	}

	int MINIMUM(int x, int y, int z) {
		int count = 0;
		while ((x != 0) && (y != 0) && (z != 0)) {
			x--;
			y--;
			z--;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques5 obj = new Ques5();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the number n");
		n = sc.nextInt();
		obj.even_odd(n);
		System.out
				.println("Now checking whether the given number is even or odd without using any condition");
		obj.Another_method_even_odd(n);
		int x, y, z;
		System.out.println("Enter the three numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		System.out
				.println("maximum of given number is=" + obj.Maximum(x, y, z));
		System.out.println("minimum of the given numbers is="
				+ obj.minimum(x, y, z));
		System.out.println("MINIMUM of the given numbers is="
				+ obj.MINIMUM(x, y, z));

	}

}
