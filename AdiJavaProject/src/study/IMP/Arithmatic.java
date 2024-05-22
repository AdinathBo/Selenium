package study.IMP;

public class Arithmatic {

	public static void main(String[] args) {
		int a=10,b=0,c;
		try{
		c=10/0;
		System.out.println(c);
	}
		catch (Exception e){
			System.out.println(e);
		}
		System.out.println("main method ended");
	}
}
