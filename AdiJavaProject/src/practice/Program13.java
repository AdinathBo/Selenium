package practice;

public class Program13 {

	public static void main(String[] args) {
		int n=3443,rem,rev=0;
		int temp=n;
		
		while(n>0) {
			rem=n%10;
			n=n/10;
			rev=(rev*10)+rem;
		}
		if(temp==rev) {
			System.out.println(temp+" :is pollindrome number");
		}
		else
		{
			System.out.println(temp+" :is not pollindrome number");
		}
	}
}
