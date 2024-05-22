package jbk;

public class A {
    int t1=10;
    void m1() {
    	System.out.println("==m1==");
    	System.out.println(t1);
    }
}
class B extends A{
	int t2;
	void m2() {
		System.out.println("==m2==");
	}
}
