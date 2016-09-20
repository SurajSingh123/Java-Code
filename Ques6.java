package test;

import java.util.Scanner;

public class Ques6 {
	void menu(int n) {
		switch (n) {
		case 1:
			System.out.println("java");
			break;
		case 2:
			System.out.println("ANDROID");
			break;
		case 3:
			System.out.println("DOTNET");
			break;
		default:
			System.out.println("Wrong entry");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques6 obj = new Ques6();
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Enter 1 for java");
			System.out.println("Enter 2 for ANDROID");
			System.out.println("Enter 3 for DOTNET");
			obj.menu(sc.nextInt());
			System.out.println("Do you want to continue, press Y oy N");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'Y');
	}

}
