package jbk;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int a=scan.nextInt();
		System.out.println("enter second number");
		int b=scan.nextInt();
		int z=a+b;
		System.out.println("result is: "+z);
	}

}
