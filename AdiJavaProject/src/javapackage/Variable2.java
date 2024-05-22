package javapackage;

public class Variable2 {
           int a=500;                              //global variable
           static String comapanyName="HDFC";      //static variable

	public static void main(String[] args) {
		
                int data=100;                //Local variable  or defining variable
                
                int p;                       //declaring variable
                p=20;                        //assigning variable
                System.out.println(p);
                p=90;                        //Reassigning variable
                System.out.println(p);       //calling variable
                
                Variable2 v2 = new Variable2(); 
                
                System.out.println(v2.a);
                System.out.println("companyName");
                
	}

}
