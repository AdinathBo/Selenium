package practice;

public class ProgramForPractice {

	public static void main(String[] args) {
		
		int a[] = {76,53,36,79,97,56};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}	
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
	 }
}
