package jbk;

public class Customer {

	public static void main(String[] args) {
		Bank b1=new Bank();
		
		b1.acc_no=122;
		b1.name="sachin";
		b1.amount=5000;
		
		Bank b2=new Bank();
		
		b2.acc_no=135;
		b2.name="saurabh";
		b2.amount=6000;
		
		System.out.println(b1.acc_no);
		System.out.println(b1.name);
		System.out.println(b1.amount);
		System.out.println("=========");
		System.out.println(b2.acc_no);
		System.out.println(b2.name);
		System.out.println(b2.amount);
		
	}

}
