package practice;

public class Program5 {

	public static void main(String[] args) {
	 int n=543;
	 int rem,sum=0;
	 while(n>0) {
		 rem=n%10;
		 n=n/10;
		 sum=sum+rem;
	 }
	 System.out.println(sum);
	}
}
