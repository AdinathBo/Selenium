package jbk;

public class Method_Overriding {
        String name;
        void say() {
        	System.out.println("Animal");
        }
}
class Fish extends Method_Overriding {
	String color;
	void say() {
		System.out.println("I am aquatic animal");
	}
}

