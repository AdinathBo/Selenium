package jbk;

public class Const_test {

	public static void main(String[] args) {
		Const obj=new Const(54,"rahul");
		
		Const obj1=new Const(56,"ramesh");
		
		obj.doExam();
		
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj1.id);
		System.out.println(obj1.name);
		

	}

}
