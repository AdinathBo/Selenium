package javapackage;

public class Variable3 {
	int bali=500;
	int raj=100;

	static int java=100;   //static 
	
	public static void main(String[] args) {
		
		int data=57;
		System.out.println(data);
		
		Variable3 v=new Variable3();
		System.out.println(Variable3.java);
		System.out.println(v.raj);
		System.out.println(v.bali);
		
		v.a();
		selenium();

	}
	public void a() {
		String b="java";      //local
		System.out.println(b);
	}
	static public void selenium() {
		int s=1000;
		System.out.println(s);
	}

}
