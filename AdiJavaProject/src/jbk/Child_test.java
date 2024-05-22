package jbk;

public class Child_test {

	public static void main(String[] args) {
		Child c=new Child();
		
		c.m1(); //10+1=11   y=1
		c.m1();  //11+1=12  y=2
		
		System.out.println(c.x);
		System.out.println(c.y);

	}

}
