package practice;

public class Program6 {

	public static void main(String[] args) {
		int n=7654;
		int rem,rev=0;
		
		while(n>0) {
			rem=n%10;
			System.out.println(" rem : "+rem);
			n=n/10;
			System.out.println(" n : "+n);
			rev=(rev*10)+rem;
			System.out.println(" rev : "+rev);
		}
		System.out.println("reverse of digit: "+rev);
	}

}
