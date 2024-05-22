package study.IMP;

public class PollindromeNum {
	public static void main(String[] args) {
		int n=4334,rem,rev=0;   //n=123
		int temp=n;
		while(n>0) {
			rem=n%10;
			n=n/10;
			rev=(rev*10)+rem;
		}
      if(temp==rev) {
    	  System.out.println("pallindrome number: "+temp);
	}
	else
	{
		System.out.println("not pallindrome number: "+temp);
	}
}
}
