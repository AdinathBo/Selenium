package study.IMP;

public class SumDigit {
	public static void main(String[] args) {
		int n=123,rem,sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("sum of digit: "+sum);
	}
}
