package test;

import java.util.Scanner;

public class Ques7 {
	void Skip_user_input(int n) {
		int i = 0;
		while (i < 10) {
			i++;
			if (i == n)
				continue;
			else
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques7 obj = new Ques7();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the user input number between 1 to 9");
		n = sc.nextInt();
		obj.Skip_user_input(n);
	}

}
