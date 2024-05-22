package study.IMP;

public class ArraySecMax {
	public static void main(String[] args) {
		int a[]= {13,16,54,310,25,555};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("second largest element is: "+a[1]);
	}
}
