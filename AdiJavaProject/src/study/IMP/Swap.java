package study.IMP;

public class Swap {
	public static void main(String[] args) {
		int a=30;
		int b=50;
		//System.out.println("before swapping a is: "+a);
		//System.out.println("before swapping b is: "+b);
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping a is: "+a);
		System.out.println("after swapping b is: "+b);
	}
}
