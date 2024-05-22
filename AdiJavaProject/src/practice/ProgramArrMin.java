package practice;

public class ProgramArrMin {

	public static void main(String[] args) {
		int a[]= {84,75,37,54,3,64};
        int min=a[0];
        for(int i=1;i<a.length;i++) {
        	if(min>a[i]) {
        		min=a[i];
        	}
        }
        System.out.println(min);
	}
}
