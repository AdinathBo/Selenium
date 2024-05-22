package jbk;

import java.util.Scanner;

public class Subtraction {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s1.nextInt();
		System.out.println("Enter second number");
		int b=s1.nextInt();
		int q=a+b;
		int z=a-b;
		int x=a*b;
		int v=a/b;
		
		System.out.println("Result is: "+q);
		System.out.println("Result is: "+z);
		System.out.println("Result is: "+x);
		System.out.println("Result is: "+v);
		
	}

}
