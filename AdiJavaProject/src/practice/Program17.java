package practice;

public class Program17 {

	public static void main(String[] args) {
		int a[]= {54,63,42,74,5,47};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
