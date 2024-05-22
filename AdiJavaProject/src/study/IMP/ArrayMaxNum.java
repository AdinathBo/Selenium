package study.IMP;

public class ArrayMaxNum {
	public static void main(String[] args) {
	      int a[]= {10,50,90,5,40,70};
	      int max=a[0];
	      for(int i=1;i<a.length;i++) {
	    	  if(a[i]>max) 
	    	  {
	    		  max=a[i];
	    	  }	
	      }
	      System.out.println(max);
		}
}
