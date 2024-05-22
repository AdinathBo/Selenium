package jbk;

public class StaticExample {
	
	int x = 10;
	static int y;
	
	public void show1() {
//		static String xyx = "adinath";
		System.out.println(y);
	}
	
	public static void show2() {
		final String xyx = "adinath";
		System.out.println(y);
	}
	
	public static void main(String[] args) {
//		StaticExample e=new StaticExample();
//		e.show2();
		StaticExample.show2();
	}

}
