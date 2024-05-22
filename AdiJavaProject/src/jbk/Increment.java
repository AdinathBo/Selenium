package jbk;

public class Increment {

	public static void main(String[] args) {
		int b=34;
		int r;
		
		r=b++ + ++b + b++ - ++b;
		
		System.out.println(r);
	}

}
