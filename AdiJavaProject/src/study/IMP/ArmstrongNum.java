package study.IMP;

public class ArmstrongNum {
	public static void main(String[] args) {
		int n=153;
		int rem,sum=0,temp=n;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum+(rem*rem*rem);
		}
		if(temp==sum) {
			System.out.println(temp+": is Armstrong number");
		}
		else {
			System.out.println(temp+": is not Armstrong number");
		}
	}
}
