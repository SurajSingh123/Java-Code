package test;
import java.util.Scanner;
public class Ques9 {
	int var;
	static int var1;
	static void display()
	{
		System.out.println("This is the static method");
	}
	void show()
	{
		System.out.println("This is non static method");
	}
	static
	{
		System.out.println("This is static block");
		setTestString("This is static block string");
		setTestValue(2);
	}
	public static void setTestString(String testString)
	{
		Ques9.testString=testString;
		System.out.println(testString);
	}
	public static void setTestValue(int n)
	{
		if(n>0)
		Ques9.n=n;
		System.out.println(n);
	}
	public static int n;
	public static int getTestValue()
	{
		return n;
	}
	public static String testString;
	public static String gettetString()
	{
		return testString;
	}
	public  int sumValue(int i, int... js) {
		int sum = i;
		for (int x : js)
			sum += x;
		return sum;
	}
	public static void main(String[] args) {
	Ques9 obj=new Ques9();
	Scanner sc=new Scanner(System.in);
	System.out.println(obj.var);
	System.out.println(var1);
	display();
	obj.show();
	int n;
	
	System.out.println("Enter the number n");
	n=sc.nextInt();
	Even_Odd.even_odd(n);
	int x1,x2,x3,x4,x5;
	System.out.println("Enter the five numbers");
	x1=sc.nextInt();
	x2=sc.nextInt();
	x3=sc.nextInt();
	x4=sc.nextInt();
	x5=sc.nextInt();
	System.out.println(obj.sumValue(x1,x2,x3,x4,x5));
	
	}

}
