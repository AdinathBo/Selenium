package jbk;

public class Super {
       int x=0;
       int y=0;     
}
class Child extends Super{
	int x=10;
	void m1() {
		x=x+1;
		y=y+1;
	}
}
