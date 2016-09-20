package test;

import java.util.Scanner;

public class Ques10 {
	int id;
	String name;

	Ques10(int i, String str) {
		id = i;
		name = str;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Ques10 obj1 = new Ques10(111, "naren");
		obj1.display();
	}

}
