package study.IMP;

public class SwapNumber {
	public static void main(String[] args) {
		int a=45;
		int b=25;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping a is: "+a);
		System.out.println("after swapping b is: "+b);
	}
}
