package javapackage;

public class Vatriables {
	int q=200;                //Global
	String name="Adinath";    //Global
	static int w=20;             //Static
	
	public static void main(String[]args) {
		int c=70;                  //Local
		
		Vatriables v = new Vatriables ();
		
		System.out.println(c);
		System.out.println(v.q);
		System.out.println(v.name);
		System.out.println(w);
		
		System.out.println(Vatriables.w);
		
		
	}
}
