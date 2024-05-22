package study.IMP;

public class Variables {
          int a=10;     //  instance/Global variable
    static int b=20;    //  static variable
public static void main(String[] args) {
		int c=30;       //  Local variable
		
		Variables v=new Variables();
		
		System.out.println(c);
		System.out.println(Variables.b);
		System.out.println(v.a);
	}
}
