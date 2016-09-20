package test;

import java.util.Scanner;

public class Ques4 {
	void print_word_using_for_loop(int n) {
		int i;
		for (i = 0; i < n; i++) {
			System.out.println("Print the word");
		}
	}

	void print_word_using_while_loop(int n) {
		int k = 0;
		while (k < n) {
			System.out.println("Print the word");
			k++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques4 obj = new Ques4();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = sc.nextInt();
		obj.print_word_using_for_loop(n);
		obj.print_word_using_while_loop(n);
	}
}
