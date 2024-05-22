package jbk;

public class Constructor {
        Constructor(){
        	System.out.println("default constructor");
        }
        Constructor(int a,int b){
        	int c=a+b;
        	System.out.println("parameterized constructor: "+c);
        }
}
