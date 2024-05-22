package study.IMP;

public class StringReverse {
	public static void main(String[] args) {
		String name="Adinath Borude";
		int length=name.length();
		String rev=" ";
		for(int i=length-1;i>=0;i--) {
			rev=rev+name.charAt(i); 
			
	/*	StringBuffer r=new StringBuffer("Learn Coding");
		System.out.println(r.reverse());
		
		StringBuilder ref=new StringBuilder("Java Coding");
		System.out.println(ref.reverse()); */
			
		}
       System.out.println(rev);
}
}
