package jbk;

public class Increment1 {

	public static void main(String[] args) {
		int a=5;
		int r=0;
		
		r=a++ + ++a + ++a + a++;
		
		System.out.println(r);
	}

}
