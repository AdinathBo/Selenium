package practice;

public class Program11 {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Before swapping: "+a);
		System.out.println("Before swapping: "+b);
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping: "+a);
		System.out.println("After swapping: "+b);
	}

}
